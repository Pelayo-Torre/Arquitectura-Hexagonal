package springboot.servicio.hexagonal.application.repositories;

import springboot.servicio.hexagonal.application.domain.User;

public interface UserRepository {
	
	public User findById(Long id);
	
	public void save(User user);

}
