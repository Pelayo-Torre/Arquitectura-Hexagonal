package springboot.servicio.hexagonal.infraestructure.database;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.servicio.hexagonal.application.domain.User;
import springboot.servicio.hexagonal.application.repositories.UserRepository;
import springboot.servicio.hexagonal.infraestructure.database.entities.UserEntity;
import springboot.servicio.hexagonal.infraestructure.database.mappers.UserEntityMapper;

@Service
public class UserDao implements UserRepository{
	
	@Autowired
	private UserDaoJPA userDaoJPA;

	@Override
	public User findById(Long id) {
		Optional<UserEntity> optional = userDaoJPA.findById(id);
		if(optional.isPresent())
			return UserEntityMapper.toDomain(optional.get());
		else
			return null;
	}

	@Override
	public void save(User user) {
		userDaoJPA.save(UserEntityMapper.toEntity(user));
	}

}
