package br.jus.jfsp.teste.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.jus.jfsp.teste.angular.model.Usuario;
import br.jus.jfsp.teste.angular.repository.UserRepository;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
 
    
	@Autowired
    private UserRepository userRepository;
 
    @GetMapping("/users")
    public List<Usuario> getUsers() {
    		System.out.println("listar");
        return (List<Usuario>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    public void addUser(@RequestBody Usuario user) {
		System.out.println("add");
    		System.out.println(user.getEmail());
        userRepository.save(user);
    }
}
