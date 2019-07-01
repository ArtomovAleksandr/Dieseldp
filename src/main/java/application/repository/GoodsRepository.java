package application.repository;

import application.entity.goods.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    //   @Modifying
   //   @Transactional
       @Query(value = "select * from goods where category_id=17",nativeQuery = true)
       public List<Goods> mySelect();

}
