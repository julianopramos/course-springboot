package br.com.fasttrack.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fasttrack.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
