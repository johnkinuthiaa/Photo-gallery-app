package com.slippery.photogalleryn.service;

import com.slippery.photogalleryn.models.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
    Image uploadImage(String category, MultipartFile imageFile) throws IOException;
    Image getImageById(Long id) ;
}
