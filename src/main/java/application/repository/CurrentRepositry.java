package application.repository;

import application.entity.currency.Current;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentRepositry extends JpaRepository<Current,Integer> {
}
