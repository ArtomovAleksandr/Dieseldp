package application.repository;

import application.entity.goods.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface FactoryRepository extends JpaRepository<Factory,Integer> {
 //   @Modifying
 //   @Transactional
 //   @Query("delete from factory f where f.active=false ")
 //   void deleteInctive();
}
