package application.service.implementation;

import application.dto.OrderDTO;
import application.dto.OrderStorageGoodsDTO;
import application.entity.goods.Goods;
import application.entity.orders.Order;
import application.entity.orders.QuantityGoodsInOrder;
import application.repository.GoodsRepository;
import application.repository.OrderRepository;
import application.repository.QuantityGoodsInOrderRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.ZonedDateTime;
import java.util.List;

@Service
public class OrderServise implements EntityService<Order> {
     @Autowired
     OrderRepository orderRepository;
     @Autowired
     GoodsRepository goodsRepository;

     public Order saveOrder(OrderDTO orderDTO) throws Exception{
         Order order=new Order();
         order.setFone(orderDTO.getFone());
         order.setName(orderDTO.getName());
         Date now = new Date();
         Date date= Calendar.getInstance().getTime();
     //    order.setCreateorder(now);
         List<OrderStorageGoodsDTO> goods=orderDTO.getGoods();
         List<QuantityGoodsInOrder>quantityGoodsInOrders=new ArrayList<>();
         for (OrderStorageGoodsDTO go:goods) {
            Goods goods1= goodsRepository.findById(go.getId()).get();
             QuantityGoodsInOrder quantityGoodsInOrder=null;
             if(goods1!=null) {
                  quantityGoodsInOrder = new QuantityGoodsInOrder(go.getQuantity(),goods1);
             }
             quantityGoodsInOrders.add(quantityGoodsInOrder);
         }
         order.setQuantityGoodsInOrders(quantityGoodsInOrders);
         orderRepository.save(order);
         return order;
     }
    @Override
     public List<Order> getAll() throws Exception{
            return  orderRepository.findAll();
     }

    @Override
    public Order getById(int id) throws Exception {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order save(Order order) throws Exception {
        return null;
    }

    @Override
    public void delete(int id) throws Exception {
         orderRepository.deleteById(id);
    }
}
