package com.slippery.photogalleryn.controller;

import com.slippery.photogalleryn.models.Image;
import com.slippery.photogalleryn.service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/gallery")
public class ImageController {
    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public String getAll(){
        return "ayee";
    }
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestPart Image uploadImageDetails, @RequestPart MultipartFile imageFile){
        return ResponseEntity.ok(service.uploadImage(uploadImageDetails,imageFile));
    }
}
