package latihan;
import java.util.ArrayList;

public class Item {
    // =============================== Property ===================================//

    private int berat;
    private String deskripsi;
    /*
     * Item memiliki hubungan one to one ke OrderDetail, 
     * karena satu item hanya bisa dimiliki oleh satu OrderDetail.
     */
    private OrderDetail orderDetail; // <- setiap item hanya dapat memilki 1 

    // ================================== Methode ===================================//

    public void getPriceForQuantity(){}

    public void getTax(){}

    public void inStock(){}

    // ============================= getter / setter ===================================//
    
    // one (with OrderDetail)
    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }
    
}
