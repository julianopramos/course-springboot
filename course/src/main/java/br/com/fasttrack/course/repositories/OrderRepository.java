package br.com.fasttrack.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fasttrack.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
