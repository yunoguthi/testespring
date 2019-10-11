package br.jus.jfsp.teste.angular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.jus.jfsp.teste.angular.model.Usuario;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {
}
