package application.repository;

import application.entity.orders.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    Page<Order> findByDoneFalse(Pageable pageable);
    Page<Order> findByDoneTrue(Pageable pageable);
    Order getByIdAndDoneIsFalse(int id);
    @Query(value = "update userorder set done=1 where id=?1",nativeQuery = true)
    int updateOrderByDoneTrue(int id);

}
