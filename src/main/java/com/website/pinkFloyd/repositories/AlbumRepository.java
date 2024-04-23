package com.website.pinkFloyd.repositories;

import com.website.pinkFloyd.entities.AlbumEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<AlbumEntity, Integer>{
    AlbumEntity getAlbumEntityByName(String name);
}
