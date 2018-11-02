package application.repository;

import application.entity.goods.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Groups,Integer> {
}
