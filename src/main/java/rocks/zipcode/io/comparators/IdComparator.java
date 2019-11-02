package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparable<Item> {
    private Long id;

    public Long getId() {
        return id;
    }

    public int compareTo(Item item2) {
        return Double.compare(this.getId(), item2.getId());
    }
}
