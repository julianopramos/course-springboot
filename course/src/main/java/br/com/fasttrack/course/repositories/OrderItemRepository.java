package br.com.fasttrack.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fasttrack.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
