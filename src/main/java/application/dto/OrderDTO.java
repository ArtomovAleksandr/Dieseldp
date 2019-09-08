package application.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    String fone;
    String name;
    private List<OrderStorageGoodsDTO> goods=new ArrayList<>();

    public OrderDTO() {
    }

    public String getFone() {
        return fone;
    }

    public String getName() {
        return name;
    }



    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderStorageGoodsDTO> getGoods() {
        return goods;
    }

    public void setGoods(List<OrderStorageGoodsDTO> goods) {
        this.goods = goods;
    }
}
