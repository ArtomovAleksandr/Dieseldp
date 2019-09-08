package application.api;

import application.dto.GoodsDTOUzel;
import application.dto.OrderDTO;
import application.dto.OrderStorageGoodsDTO;
import application.entity.goods.Uzel;
import application.entity.users.User;
import application.helper.JSONResult;
import application.helper.JSONResultOk;
import application.service.implementation.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping(value="/api/v1.0/orders")
public class OrderController {

    @Autowired
    private GoodsService goodsService;
    @GetMapping (value = "/create")
    public JSONResult<Uzel> createOrder(){
          String hallo="fsd";
          String foo="gdf";
          Uzel newUzel = new Uzel();
          newUzel.setId(34);
          newUzel.setName("doo");
   //     List<OrderStorageGoodsDTO> list=new ArrayList<>();
      //  String fone=order.getFone();
       // String name=order.getName();
       // List<> goodsDTOList=order.getGoods();
      // return new JSONResultOk<>(order);
        return new JSONResultOk<>(newUzel);
    }

}
