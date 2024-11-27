package com.slippery.photogalleryn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Image {
    @Id
    private Long id;
    private LocalDateTime createdOn;
    private String category;
    @ElementCollection
    private List<String> categories;
    @Lob
    private byte[] imageFile;
    private String imageType;
    private String fileName;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}

