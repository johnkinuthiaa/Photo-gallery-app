package com.slippery.photogalleryn.service;

import com.slippery.photogalleryn.models.Image;
import com.slippery.photogalleryn.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;

@Service
public class ImageServiceImpl implements ImageService{
    private final ImageRepository repository;
    private ImageServiceImpl(ImageRepository repository){
        this.repository=repository;
    }
    @Override
    public Image uploadImage(String category, MultipartFile imageFile) throws IOException {
        Image image =new Image();
        image.setCategory(category);
        image.setImageFile(imageFile.getBytes());
        image.setFileName(imageFile.getOriginalFilename());
        image.setCreatedOn(LocalDateTime.now());
        image.setImageType(imageFile.getContentType());

        return repository.save(image);
    }

    @Override
    public Image getImageById(Long id) {
        return null;
    }
}
