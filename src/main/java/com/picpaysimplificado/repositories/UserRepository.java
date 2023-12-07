package com.picpaysimplificado.repositories;

import com.picpaysimplificado.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
