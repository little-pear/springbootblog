package com.bai.dao;

import com.bai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bai
 * @create 2020-09-16-21:19
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
