package br.com.estudando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudando.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
