package springboot.servicio.hexagonal.infraestructure.rest.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.servicio.hexagonal.application.services.UserService;
import springboot.servicio.hexagonal.infraestructure.rest.dto.UserDTO;
import springboot.servicio.hexagonal.infraestructure.rest.dto.UserMapper;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/find/{id}")
	public UserDTO findUserById(@PathVariable Long id) {
		return UserMapper.toDto(userService.findById(id));
	}
	
	@PostMapping("/save")
	public void saveUser(@RequestBody UserDTO dto) {
		userService.save(UserMapper.toDomain(dto));
	}
}
