package br.com.estudando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudando.course.entities.Category;
import br.com.estudando.course.entities.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
