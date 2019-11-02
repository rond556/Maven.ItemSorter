package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparable<Item> {
        private String name;

        public String getName() { return name; }

        public int compareTo(Item item2) {
            return Double.compare(this.getName(), item2.getName());
        }
}
