package com.tfl.shayon.springboot.photoz.repository;

import com.tfl.shayon.springboot.photoz.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
