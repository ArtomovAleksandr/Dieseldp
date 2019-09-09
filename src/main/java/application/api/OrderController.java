package application.api;

import application.dto.GoodsDTOUzel;
import application.dto.OrderDTO;
import application.dto.OrderStorageGoodsDTO;
import application.entity.goods.Uzel;
import application.entity.orders.Order;
import application.entity.users.User;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementation.GoodsService;
import application.service.implementation.OrderServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/v1.0/orders")
public class OrderController {

    @Autowired
    OrderServise orderServise;
    @PostMapping (value = "/create")
    public JSONResult<Order> createOrder(@RequestBody OrderDTO orderDTO){
        Order newOrder=new Order();
        try {
           newOrder=orderServise.saveOrder(orderDTO);
        }catch (Exception ex){
            return new JSONResultError<>(newOrder,ex.getMessage());
        }
        return new JSONResultOk<>(newOrder);
//        OrderDTO newOrderDTO=new OrderDTO();
//          String hallo=orderDTO.getFone();
//          String foo=orderDTO.getName();
//          List<OrderStorageGoodsDTO> orderStorageGoodsDTOS=new ArrayList<>();
//          orderStorageGoodsDTOS=orderDTO.getGoods();
//          Uzel newUzel = new Uzel();
//          newUzel.setId(34);
//          newUzel.setName("doo");
   //    List<OrderStorageGoodsDTO> list=new ArrayList<>();
      //  String fone=order.getFone();
       // String name=order.getName();
       // List<> goodsDTOList=order.getGoods();
    //   return new JSONResultOk<>(newOrderDTO);

    }

}
