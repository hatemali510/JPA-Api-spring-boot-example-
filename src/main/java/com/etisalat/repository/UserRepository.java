package com.etisalat.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etisalat.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	

}
