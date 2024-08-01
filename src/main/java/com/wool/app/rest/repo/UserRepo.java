package com.wool.app.rest.repo;

import com.wool.app.rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {

}
