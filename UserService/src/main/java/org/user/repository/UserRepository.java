package org.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.user.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}

