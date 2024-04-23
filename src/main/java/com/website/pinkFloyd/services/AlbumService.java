package com.website.pinkFloyd.services;

import com.website.pinkFloyd.entities.AlbumEntity;
import com.website.pinkFloyd.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public void createAlbumPage(Model model, String albumName){
        String find = Arrays.stream(albumName.split("-"))
                .map(e -> Character.toUpperCase(e.charAt(0)) + e.substring(1))
                .collect(Collectors.joining(" "));
        AlbumEntity albumEntity = albumRepository.getAlbumEntityByName(find);
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/" + albumName.replace("-", "_") + ".jpg");
        model.addAttribute("infoParagraph1", paragraphs[0]);
        model.addAttribute("infoParagraph2", paragraphs[1]);
        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/" + albumName);
    }
}
