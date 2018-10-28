package application.service.interfaces;

import java.util.List;

public interface EntityService<Entity>{
    List<Entity> getAll() throws Exception;
    Entity getById(int id) throws Exception;
    Entity save(Entity entity) throws Exception;
    void delete(int id) throws Exception;
}
