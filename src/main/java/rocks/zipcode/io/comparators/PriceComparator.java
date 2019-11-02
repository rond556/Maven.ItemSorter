package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparable<Item> {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public int compareTo(Item item2) {
        return Double.compare(this.getPrice(), item2.getPrice());
    }
}
