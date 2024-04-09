package com.website.pinkFloyd.services;

import com.website.pinkFloyd.entities.AlbumEntity;
import com.website.pinkFloyd.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public AlbumEntity get(int id){
        return albumRepository.findById(id).orElse(null);
    }

    public AlbumEntity getByName(String name){
        return ((List<AlbumEntity>)albumRepository.findAll()).stream()
                .filter(album -> album.getName().equals(name))
                .findFirst().orElse(null);
    }
}
