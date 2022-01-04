package br.com.fasttrack.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fasttrack.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
