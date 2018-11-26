package com.multi.datasource.multi.repository.first;

import com.multi.datasource.multi.entity.first.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findById(int id);
}
