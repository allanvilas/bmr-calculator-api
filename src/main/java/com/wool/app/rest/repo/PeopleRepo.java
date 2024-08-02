package com.wool.app.rest.repo;

import com.wool.app.rest.models.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepo extends JpaRepository<People, Long> {

}
