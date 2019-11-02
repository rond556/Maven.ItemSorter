package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void priceSorterTest1(){
    Item item1 = new Item(75131L, "Ringo", 1.00);
    Item item2 = new Item(84031L, "Budou", 10.00);
    Item item3 = new Item(77884L, "Sakurambo", 7.00);
    Item[] itemCollection = {item1, item2, item3};
    Item[] expected = {item1, item3, item2};
    ItemSorter itemSorter = new ItemSorter(itemCollection);
    Comparator<Item> comparator = new PriceComparator();

    Item[] actual = itemSorter.sort(comparator);

    Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void priceSorterTest2(){
        Item item1 = new Item(75131L, "Ringo", 6.00);
        Item item2 = new Item(84031L, "Budou", 3.00);
        Item item3 = new Item(77884L, "Sakurambo", 1.00);
        Item[] itemCollection = {item1, item2, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemCollection);
        Comparator<Item> comparator = new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void priceSorterTest3(){
        Item item1 = new Item(75131L, "Ringo", 7.00);
        Item item2 = new Item(84031L, "Budou", 1.00);
        Item item3 = new Item(77884L, "Sakurambo", 14.00);
        Item[] itemCollection = {item1, item2, item3};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(itemCollection);
        Comparator<Item> comparator = new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertArrayEquals(expected,actual);
    }

}
