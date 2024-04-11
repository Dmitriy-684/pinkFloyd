package com.website.pinkFloyd.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/track-list", method = RequestMethod.GET)
public class TrackListController {

    @GetMapping("the-endless-river")
    public String endlessRiver(Model model){
        return "./track_lists/endless_river_tracks";
    }
}
