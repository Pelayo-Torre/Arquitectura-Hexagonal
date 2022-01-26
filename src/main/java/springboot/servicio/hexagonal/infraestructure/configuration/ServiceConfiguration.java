package springboot.servicio.hexagonal.infraestructure.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springboot.servicio.hexagonal.application.services.UserService;
import springboot.servicio.hexagonal.application.services.UserServiceImpl;
import springboot.servicio.hexagonal.infraestructure.database.UserDao;

@Configuration
public class ServiceConfiguration {

	@Bean
	@Autowired
	public UserService createUserService(UserDao userDao) {
		return new UserServiceImpl(userDao);
	}
	
}
