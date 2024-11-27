package com.slippery.photogalleryn.repository;

import com.slippery.photogalleryn.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
