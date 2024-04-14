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
        model.addAttribute("title", "The Endless River tracks");
        return "./track_list/endless_river_tracks";
    }

    @GetMapping("the-division-bell")
    public String divisionBell(Model model){
        model.addAttribute("title", "The Division Bell tracks");
        return "./track_list/division_bell_tracks";
    }
}
