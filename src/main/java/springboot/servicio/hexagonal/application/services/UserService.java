package springboot.servicio.hexagonal.application.services;

import springboot.servicio.hexagonal.application.domain.User;

public interface UserService {
	
	public User findById(Long id);
	
	public void save(User user);

}
