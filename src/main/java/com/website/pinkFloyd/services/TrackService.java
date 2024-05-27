package com.website.pinkFloyd.services;


import com.website.pinkFloyd.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public String getTrackPage(Model model, String albumName){
        model.addAttribute("title", albumName + "tracks");
        model.addAttribute("albumRef", "http://localhost:8080/album-info/" + albumName);
        return "./track_list/" + albumName.replace("-", "_") + "_tracks";
    }
}
