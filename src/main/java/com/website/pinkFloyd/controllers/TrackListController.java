package com.website.pinkFloyd.controllers;


import com.website.pinkFloyd.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TrackListController {

    @Autowired
    private TrackService trackService;

    @GetMapping("/track-list/{albumName}")
    public String getTrackList(@PathVariable String albumName, Model model){
        return trackService.getTrackPage(model, albumName);
    }
}
