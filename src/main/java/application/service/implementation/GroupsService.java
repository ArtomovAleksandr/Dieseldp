package application.service.implementation;

import application.entity.goods.Groups;
import application.repository.GroupsRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupsService implements EntityService<Groups> {
    @Autowired
    GroupsRepository groupsRepository;


    @Override
    public List<Groups> getAll() throws Exception {
        return groupsRepository.findAll();
    }

    @Override
    public Groups getById(int id) throws Exception {
        return groupsRepository.findById(id).get();
    }

    @Override
    public Groups save(Groups groups) throws Exception {
        return groupsRepository.save(groups);
    }

    @Override
    public void delete(int id) throws Exception {
          groupsRepository.deleteById(id);
    }
}
