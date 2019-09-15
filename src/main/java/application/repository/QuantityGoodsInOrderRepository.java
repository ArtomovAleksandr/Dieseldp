package application.repository;

import application.entity.orders.Order;
import application.entity.orders.QuantityGoodsInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuantityGoodsInOrderRepository extends JpaRepository<QuantityGoodsInOrder,Integer> {
    List<QuantityGoodsInOrder> findAllByOrder(Order order);
}
