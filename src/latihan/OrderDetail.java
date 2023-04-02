package latihan;

import java.util.ArrayList;
import java.util.List;

public class OrderDetail{
    // =============================== Property ===================================//
    private String quality;
    private String taxStatus;
    /*
     * OrderDetail adalah class dengan hubungan zero to many ke Item, 
     * karena satu OrderDetail bisa memiliki banyak Item dan bisa tidak ada
     */
    private List<Item> items; 
    /*
     * OrderDetail adalah class dengan hubungan one to many ke Order,
     * karena satu OrderDetail bisa memiliki banyak Order 
     */
    private List<Order> orders;
    
    // ================================== Methode ===================================//
    public OrderDetail() {
        // namun setiap pembuatan object, dibuatkan array nya (many)
        this.items = new ArrayList<>(); 
        this.orders = new ArrayList<>(); 
    }
    
    public void calcSubTotal(){}

    public void calcWeight(){}

    public void Tax(){}

    // ============================= getter / setter ===================================//
    
    // zero to many (with Item)
    public void setItems(Item items) {
        this.items.add(items);
    }

    // one to many (with Order)
    public void setOrders(Order orders) {
        this.orders.add(orders);
        orders.setOrderDetail(this); // <- inilah yang membedakan zero to many dengan one to many 
    }
    
}
