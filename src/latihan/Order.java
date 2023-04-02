package latihan;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    // =============================== Property ===================================//
    private Date date;
    private String status;
    private OrderDetail orderDetail;
    private List<Customer> customers;
    private Payment payment;
    
    // ================================== Methode ===================================//
    // kalau aggregasi, dimasukin lewat constructor orderDetailnya
    public Order(Date date, String status, OrderDetail orderDetail) {
        this.date = date;
        this.status = status;
        this.orderDetail = orderDetail;

        this.customers = new ArrayList<>();
    }
    public void calcSubTotal(){}
    public void Tax(){}
    public void Total(){}
    public void calcTotalWeight(){}

    // ============================= getter / setter ===================================//

    // one (with orderDetail)
    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    // zero to one (with customer)
    public void setCustomers(Customer customers) {
        this.customers.add(customers);
    }

    // one (with payment)
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
