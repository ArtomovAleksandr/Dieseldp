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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderServise implements EntityService<Order> {
     @Autowired
     OrderRepository orderRepository;
     @Autowired
     GoodsRepository goodsRepository;
     @Autowired
     QuantityGoodsInOrderRepository quantityGoodsInOrderRepository;

     public Order saveOrder(OrderDTO orderDTO) throws Exception{
         Order order=new Order();
         order.setFone(orderDTO.getFone());
         order.setName(orderDTO.getName());
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
     public Page<Order> findByDoneFalse(Pageable pageable) throws Exception{
         return orderRepository.findByDoneFalse(pageable);
     }

     public Order getByIdDoneIsFalse(int id) throws Exception{
         return orderRepository.getByIdAndDoneIsFalse(id);
     }
     public void setOrderDoneTrue(int id) throws Exception{
         Order order=getById(id);
     //    List<QuantityGoodsInOrder> quantityGoodsInOrderList= order.getQuantityGoodsInOrders();
         order.setDone(true);
         save(order);
       //  return 1;
     }
    public void deleteGoodsInOrder (int idorder, int idgoods) throws Exception {
        List<QuantityGoodsInOrder> quantityGoodsInOrderList=new ArrayList<>();
        Order order=new Order();
         order=getById(idorder);
         quantityGoodsInOrderList= order.getQuantityGoodsInOrders();
         if(quantityGoodsInOrderList.size()==1){
             order.setQuantityGoodsInOrders(null);
         }else {
             for (QuantityGoodsInOrder inorder : quantityGoodsInOrderList) {
                 if (inorder.getGoods().getId() == idgoods) {
                     quantityGoodsInOrderList.remove(inorder);
                 }
             }
         }
        save(order);
    }
    @Override
    public List<Order> getAll() throws Exception {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(int id) throws Exception {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order save(Order order) throws Exception {
        return orderRepository.save(order);
    }

    @Override
    public void delete(int id) throws Exception {
         orderRepository.deleteById(id);
    }


}
