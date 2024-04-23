package com.website.pinkFloyd.services;


import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class TrackService {

    public String getTrackPage(Model model, String albumName){
        model.addAttribute("title", albumName + "tracks");
        return "./track_list/" + albumName.replace("-", "_") + "_tracks";
    }
}
