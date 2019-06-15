package application.service.implementation;

import application.entity.goods.Unit;
import application.repository.UnitRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnitServise implements EntityService<Unit> {
    @Autowired
    UnitRepository unitRepository;
    @Override
    public List<Unit> getAll() throws Exception {
        return unitRepository.findAll();
    }

    @Override
    public Unit getById(int id) throws Exception {
        return unitRepository.findById(id).get();
    }

    @Override
    public Unit save(Unit unit) throws Exception {
        return null;
    }

    @Override
    public void delete(int id) throws Exception {

    }
}
