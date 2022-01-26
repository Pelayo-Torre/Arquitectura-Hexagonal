package springboot.servicio.hexagonal.infraestructure.database.mappers;

import springboot.servicio.hexagonal.application.domain.User;
import springboot.servicio.hexagonal.infraestructure.database.entities.UserEntity;

public class UserEntityMapper {
	
	public static User toDomain(UserEntity entity) {
		User user = new User(
			entity.getName(),
			entity.getSurname(),
			entity.getMail(),
			entity.getNif()
		);
		
		return user;
	}
	
	public static UserEntity toEntity(User user) {
		UserEntity entity = new UserEntity();
		
		entity.setMail(user.getMail());
		entity.setName(user.getName());
		entity.setNif(user.getNif());
		entity.setSurname(user.getSurname());
		
		return entity;
	}

}
