package springboot.servicio.hexagonal.infraestructure.database;

import org.springframework.data.repository.CrudRepository;

import springboot.servicio.hexagonal.infraestructure.database.entities.UserEntity;

public interface UserDaoJPA extends CrudRepository<UserEntity, Long>{

}
