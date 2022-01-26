package springboot.servicio.hexagonal.application.services;

import springboot.servicio.hexagonal.application.domain.User;
import springboot.servicio.hexagonal.application.repositories.UserRepository;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		//Validación de que el ID venga informado
		return userRepository.findById(id);
	}

	@Override
	public void save(User user) {
		//Validación de que los datos del usuario sean correctos
		userRepository.save(user);		
	}
	
	

}
