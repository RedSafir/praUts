package latihan;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    // =============================== Property ===================================//
    private float amount;
    private List<Order> orders;
    
    // ================================== Methode ===================================//
    public Payment() {
        this.orders = new ArrayList<>();
    }

    // ============================= getter / setter ===================================//
    // one to many (with orders)
    public void setOrders(Order orders) {
        this.orders.add(orders);
        orders.setPayment(this);
    }
}
