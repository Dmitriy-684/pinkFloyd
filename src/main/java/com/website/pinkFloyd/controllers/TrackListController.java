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

    @GetMapping("a-momentary-lapse-of-reason")
    public String lapse(Model model){
        model.addAttribute("title", "A Momentary Lapse Of Reason tracks");
        return "./track_list/lapse_tracks";
    }

    @GetMapping("the-final-cut")
    public String finalCut(Model model){
        model.addAttribute("title", "The Final Cut tracks");
        return "./track_list/final_cut_tracks";
    }

    @GetMapping("the-wall")
    public String theWall(Model model){
        model.addAttribute("title", "The Wall tracks");
        return "./track_list/the_wall_tracks";
    }

    @GetMapping("animals")
    public String animals(Model model){
        model.addAttribute("title", "Animals tracks");
        return "./track_list/animals_tracks";
    }

    @GetMapping("wish-you-were-here")
    public String wereHere(Model model){
        model.addAttribute("title", "Wish You Were Here tracks");
        return "./track_list/were_here_tracks";
    }

    @GetMapping("the-dark-side-of-the-moon")
    public String darkSide(Model model){
        model.addAttribute("title", "The Dark Side Of The Moon tracks");
        return "./track_list/dark_side_tracks";
    }

    @GetMapping("meddle")
    public String meddle(Model model){
        model.addAttribute("title", "Meddle tracks");
        return "./track_list/meddle_tracks";
    }

    @GetMapping("atom-heart-mother")
    public String atomHeart(Model model){
        model.addAttribute("title", "Atom Heart Mother tracks");
        return "./track_list/atom_heart_tracks";
    }

    @GetMapping("ummagumma")
    public String ummagumma(Model model){
        model.addAttribute("title", "Ummagumma tracks");
        return "./track_list/ummagumma_tracks";
    }

    @GetMapping("a-saucerful-of-secrets")
    public String secrets(Model model){
        model.addAttribute("title", "A Saucerful Secrets tracks");
        return "./track_list/secrets_tracks";
    }

    @GetMapping("the-piper-at-the-gates-of-dawn")
    public String piper(Model model){
        model.addAttribute("title", "The Piper At The Gates Of Dawn tracks");
        return "./track_list/piper_tracks";
    }
}
