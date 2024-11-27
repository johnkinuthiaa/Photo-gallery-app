package com.slippery.photogalleryn.service;

import com.slippery.photogalleryn.models.Image;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageServiceImpl implements ImageService{
    @Override
    public Image uploadImage(Image imageDetails, MultipartFile imageFile) {
        return null;
    }
}
