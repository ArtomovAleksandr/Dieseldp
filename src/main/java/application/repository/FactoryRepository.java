package application.repository;

import application.entity.goods.Factory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactoryRepository extends JpaRepository<Factory,Integer> {
}
