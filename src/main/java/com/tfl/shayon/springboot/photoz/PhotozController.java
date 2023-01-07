package com.tfl.shayon.springboot.photoz;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.*;

@RestController
public class PhotozController {

    private final PhotozService photozService;

    public PhotozController(PhotozService photozService) {
        this.photozService = photozService;
    }

//    private List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/photoz")
    public Collection<Photo> get(){
        return photozService.get();
    }

    @GetMapping("/photoz/{id}")
    public Photo get(@PathVariable String id){
        Photo photo = photozService.get(id);
        if(photo == null ) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photoz/{id}")
    public void delete(@PathVariable String id){
        Photo photo = photozService.remove(id);
        if(photo == null ) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

//    @PostMapping("/photoz")
//    public Photo create(@RequestBody @Valid Photo photo){
//        photo.setId(UUID.randomUUID().toString());
//        db.put(photo.getId(), photo);
//        return photo;
//    }
    @PostMapping("/photoz")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        return photozService.save(file.getOriginalFilename(), file.getBytes());
    }
}
