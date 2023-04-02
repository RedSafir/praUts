package latihan;

public class Customer {
    // =============================== Property ===================================//
    private String name;
    private String address;
    private Order order;
    // ================================== Methode ===================================//
    

    // ============================= getter / setter ===================================//
    // one (with order)
    public void setOrder(Order order) {
        this.order = order;
    }
}
