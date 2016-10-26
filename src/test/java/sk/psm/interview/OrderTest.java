package sk.psm.interview;

import org.junit.Test;

/**
 * @author neschopak
 */
public class OrderTest {

    @Test
    public void addItemTest() {
        Order o = new Order();
        o.addItem(new OrderItem());
    }
}
