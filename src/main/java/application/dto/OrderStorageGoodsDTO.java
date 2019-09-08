package application.dto;

public class OrderStorageGoodsDTO {
    int id;
    int quantity;
    public OrderStorageGoodsDTO(){

    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
