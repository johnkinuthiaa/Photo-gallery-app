package com.slippery.photogalleryn.controller;

import com.slippery.photogalleryn.models.Image;
import com.slippery.photogalleryn.service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/gallery")
public class ImageController {
    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam String category, @RequestParam MultipartFile imageFile) throws IOException {
        return ResponseEntity.ok(service.uploadImage(category,imageFile));
    }
    @GetMapping("/get/image")
    public ResponseEntity<Image> getImageById(@RequestParam Long id) {
        return ResponseEntity.ok(service.getImageById(id));
    }
}
