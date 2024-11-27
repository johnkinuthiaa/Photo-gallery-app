package com.slippery.photogalleryn.service;

import com.slippery.photogalleryn.models.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    Image uploadImage(Image imageDetails, MultipartFile imageFile);
}
