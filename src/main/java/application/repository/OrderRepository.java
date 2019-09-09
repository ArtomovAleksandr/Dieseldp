package application.repository;

import application.entity.orders.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    Page<Order> findByDoneFalse(Pageable pageable);
    Page<Order> findByDoneTrue(Pageable pageable);

}
