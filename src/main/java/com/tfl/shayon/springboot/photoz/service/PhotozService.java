package com.tfl.shayon.springboot.photoz.service;

import com.tfl.shayon.springboot.photoz.model.Photo;
import com.tfl.shayon.springboot.photoz.repository.PhotozRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


//@Controller
@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }


//    private Map<String, Photo> db = new HashMap<>(){{
//        put("1", new Photo("1", "hello.jpg"));
//    }};

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        System.out.println("Content type ============================================================");
        System.out.println(contentType);
        photo.setFileName(fileName);
        System.out.println("File name =============================================================");
        System.out.println(fileName);
        photo.setData(data);
        System.out.println("Data =========================================================");
        System.out.println(data);
        System.out.println("Photo ==========================================================");
        System.out.println(photo);
        photozRepository.save(photo);
        return photo;
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }


}
