package com.jetbrains.ahmad.photoz.clone.service;

import com.jetbrains.ahmad.photoz.clone.model.Photo;
import com.jetbrains.ahmad.photoz.clone.repository.PhotozRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

//    private Map<String, Photo> db=new HashMap<>(){{
//        put("1",new Photo("1","hello.jpg"));
//    }};


    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
         photozRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo= new Photo();
        photo.setContentType(contentType);

        photo.setFileName(fileName);
        photo.setData(data);

        photozRepository.save(photo);
        return photo;
    }
}
