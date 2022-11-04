package br.com.estudando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudando.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
