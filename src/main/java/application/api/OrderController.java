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
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteOrder(@PathVariable int id) {
        try {
            orderServise.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    @PutMapping("/setdonetrue/{id}")
    public boolean setDoneTrue(@PathVariable int id){
        try{
             orderServise.setOrderDoneTrue(id);
        }catch (Exception ex){
            return  false;
        }
        return true;
    }
    @DeleteMapping("/delete/{idorder}/{idgoods}")
    public boolean deleteGoodsInOrder(@PathVariable int idorder,@PathVariable int idgoods) {
        try {
            orderServise.deleteGoodsInOrder(idorder,idgoods);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

}
