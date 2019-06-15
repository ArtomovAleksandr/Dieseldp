package application.repository;

import application.entity.goods.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<Unit,Integer> {
}
