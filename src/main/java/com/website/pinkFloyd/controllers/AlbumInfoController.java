package com.website.pinkFloyd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/album-info")
public class AlbumInfoController {

    @GetMapping("/the-endless-river")
    public String endlessRiver(Model model){
        model.addAttribute("albumName", "The Endless River");
        model.addAttribute("albumCover", "../images/albums/the_endless_river.jpg");
        model.addAttribute("albumInfo", "Короче альбом крутой всем советую написали хуй знает когда" +
                " спасибо старшим за старание!!! спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!спасибо старшим за старание!!!спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "спасибо старшим за старание!!!" +
                "v" +
                "спасибо старшим за старание!!!");
        return "album_info";
    }

    @GetMapping("/the-division-bell")
    public String divisionBell(Model model){
        model.addAttribute("albumName", "The Division Bell");
        model.addAttribute("albumCover", "../images/albums/the_division_bell.jpg");
        return "album_info";
    }

    @GetMapping("/a-momentary-lapse-of-reason")
    public String lapse(){
        return "lapse";
    }

    @GetMapping("/the-final-cut")
    public String finalCut(){
        return "final_cut";
    }

    @GetMapping("/the-wall")
    public String wall(){
        return "wall";
    }

    @GetMapping("/animals")
    public String animals(){
        return "animals";
    }

    @GetMapping("/wish-you-were-here")
    public String wereHere(){
        return "were_here";
    }

    @GetMapping("/the-dark-side-of-the-moon")
    public String darkSide(){
        return "dark_side";
    }

    @GetMapping("/meddle")
    public String meddle(){
        return "meddle";
    }

    @GetMapping("/atom-heart-mother")
    public String atomHeart(){
        return "atom_heart";
    }

    @GetMapping("/ummagumma")
    public String ummagumma(){
        return "ummagumma";
    }
}
