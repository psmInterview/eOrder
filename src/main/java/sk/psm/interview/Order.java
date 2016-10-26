package sk.psm.interview;

import java.util.Collection;

/**
 * @author neschopak
 */
public class Order {

    public Collection items;

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public static void pay() {
        new Payment().pay();
    }

    static class Payment {

        void pay() {
            System.out.println("calculating price...");
            System.out.println("processing payment...");
            System.out.println("payment done.");
        }
    }
}
