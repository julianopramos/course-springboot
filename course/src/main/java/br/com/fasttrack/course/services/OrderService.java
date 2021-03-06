package br.com.fasttrack.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fasttrack.course.entities.Order;
import br.com.fasttrack.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository Repository;
	
	public List<Order> findAll(){
		return Repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = Repository.findById(id);
		return obj.get();
	}

}
