package br.com.fasttrack.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fasttrack.course.entities.OrderItem;
import br.com.fasttrack.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository Repository;
	
	public List<OrderItem> findAll(){
		return Repository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = Repository.findById(id);
		return obj.get();
	}

}
