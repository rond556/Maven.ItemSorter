package rocks.zipcode.io;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest{

    @Test
    public void getName() {
        String expected = "Rock";
        Item rock = new Item(null,expected,null);
        String actual = rock.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        Item rock = new Item(null,null,null);
        String expected = "Rock";
        rock.setName(expected);
        String actual = rock.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        Long expected = 75319L;
        Item rock = new Item(expected,null,null);
        Long actual = rock.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setId() {
        Item rock = new Item(null,null,null);
        Long expected = 75319L;
        rock.setId(expected);
        Long actual = rock.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {
        Double expected = 12.99;
        Item rock = new Item(null,null,expected);
        Double actual = rock.getPrice();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPrice() {
        Item rock = new Item(null,null,null);
        Double expected = 12.99;
        rock.setPrice(expected);
        Double actual = rock.getPrice();

        Assert.assertEquals(expected, actual);
    }
}
