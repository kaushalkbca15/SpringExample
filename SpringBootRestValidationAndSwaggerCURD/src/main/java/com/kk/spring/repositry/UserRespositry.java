package com.kk.spring.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kk.spring.entity.UserEntity;

@Repository
public interface UserRespositry extends JpaRepository<UserEntity, Long> {

}
