package application.repository;

import application.entity.orders.QuantityGoodsInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityGoodsInOrderRepository extends JpaRepository<QuantityGoodsInOrder,Integer> {
}
