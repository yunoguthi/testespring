package br.jus.jfsp.teste.angular;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.jus.jfsp.teste.angular.model.*;
import br.jus.jfsp.teste.angular.repository.UserRepository;

@SpringBootApplication (scanBasePackages={
		"br.jus.jfsp.teste.angular.controller"})
@EntityScan("br.jus.jfsp.teste.angular.model")
@EnableJpaRepositories("br.jus.jfsp.teste.angular.repository")
@ComponentScan ({"br.jus.jfsp.teste.angular.controller"})
public class App {
 
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
 
//    @Bean
//    CommandLineRunner init(UserRepository userRepository) {
//        return args -> {
//            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//                Usuario user = new Usuario(name, name.toLowerCase() + "@domain.com");
//                userRepository.save(user);
//            });
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }
}