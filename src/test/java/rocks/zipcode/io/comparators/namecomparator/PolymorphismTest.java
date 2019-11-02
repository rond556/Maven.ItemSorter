package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;


public class PolymorphismTest {
    @Test
    public void test1() {
        NameComparator nameComparator = new NameComparator();
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
