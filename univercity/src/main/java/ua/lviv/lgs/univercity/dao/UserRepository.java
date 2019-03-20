package ua.lviv.lgs.univercity.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.univercity.domain.User;



public interface UserRepository extends JpaRepository <User, Integer>{
	List<User> findByEmail(String email);
}
