package springboot.servicio.hexagonal.infraestructure.rest.dto;

import springboot.servicio.hexagonal.application.domain.User;

public class UserMapper {
	
	public static UserDTO toDto(User user) {
		UserDTO dto = new UserDTO();
		
		dto.id = user.getId();
		dto.mail = user.getMail();
		dto.name = user.getName();
		dto.surname = user.getSurname();
		
		return dto;
	}
	
	public static User toDomain(UserDTO dto) {
		User user = new User(
			dto.name,
			dto.surname,
			dto.mail,
			dto.nif
		);
		
		return user;
	}

}
