package com.slippery.photogalleryn.repository;

import com.slippery.photogalleryn.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
