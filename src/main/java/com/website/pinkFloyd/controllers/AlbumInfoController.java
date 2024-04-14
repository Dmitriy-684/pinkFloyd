package com.website.pinkFloyd.controllers;

import com.website.pinkFloyd.entities.AlbumEntity;
import com.website.pinkFloyd.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/album-info", method = RequestMethod.GET)
public class AlbumInfoController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/the-endless-river")
    public String endlessRiver(Model model){
        AlbumEntity albumEntity = albumService.getByName("The Endless River");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_endless_river.jpg");
        model.addAttribute("infoParagraph1", paragraphs[0]);
        model.addAttribute("infoParagraph2", paragraphs[1]);
        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-endless-river");
        return "album_info";
    }

    @GetMapping("/the-division-bell")
    public String divisionBell(Model model){
        AlbumEntity albumEntity = albumService.getByName("The Division Bell");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_division_bell.jpg");
        model.addAttribute("infoParagraph1", paragraphs[0]);
        model.addAttribute("infoParagraph2", paragraphs[1]);
        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-division-bell");
        return "album_info";
    }

    @GetMapping("/a-momentary-lapse-of-reason")
    public String lapse(Model model){
        model.addAttribute("albumName", "A Momentary Lapse Of Reason");
        model.addAttribute("albumCover", "../images/covers/a_momentary_lapse_of_reason.jpg");
        return "album_info";
    }

    @GetMapping("/the-final-cut")
    public String finalCut(Model model){
        model.addAttribute("albumName", "The Final Cut");
        model.addAttribute("albumCover", "../images/covers/the_final_cut.jpg");
        return "album_info";
    }

    @GetMapping("/the-wall")
    public String wall(Model model)
    {
        model.addAttribute("albumName", "The Wall");
        model.addAttribute("albumCover", "../images/covers/the_wall.jpg");
        return "album_info";
    }

    @GetMapping("/animals")
    public String animals(Model model){
        model.addAttribute("albumName", "Animals");
        model.addAttribute("albumCover", "../images/covers/animals.jpg");
        return "album_info";
    }

    @GetMapping("/wish-you-were-here")
    public String wereHere(Model model){
        model.addAttribute("albumName", "Wish You Were Here");
        model.addAttribute("albumCover", "../images/covers/wish_you_were_here.jpg");
        return "album_info";

    }

    @GetMapping("/the-dark-side-of-the-moon")
    public String darkSide(Model model){
        model.addAttribute("albumName", "The Dark Side Of The Moon");
        model.addAttribute("albumCover", "../images/covers/the_dark_side_of_the_moon.jpg");
        return "album_info";

    }

    @GetMapping("/meddle")
    public String meddle(Model model){
        model.addAttribute("albumName", "Meddle");
        model.addAttribute("albumCover", "../images/covers/meddle.jpg");
        return "album_info";
    }

    @GetMapping("/atom-heart-mother")
    public String atomHeart(Model model)
    {
        model.addAttribute("albumName", "Atom Heart Mother");
        model.addAttribute("albumCover", "../images/covers/atom_heart_mother.jpg");
        return "album_info";
    }

    @GetMapping("/ummagumma")
    public String ummagumma(Model model){
        model.addAttribute("albumName", "Ummagumma");
        model.addAttribute("albumCover", "../images/covers/ummagumma.jpg");
        return "album_info";
    }

    @GetMapping("/a-saucerful-of-secrets")
    public String secrets(Model model){
        model.addAttribute("albumName", "A Saucerful Of Secrets");
        model.addAttribute("albumCover", "../images/covers/a_saucerful_of_secrets.jpg");
        return "album_info";
    }

    @GetMapping("/the-piper-at-the-gates-of-dawn")
    public String piper(Model model){
        model.addAttribute("albumName", "The Piper At The Gates Of Dawn");
        model.addAttribute("albumCover", "../images/covers/the_piper_at_the_gates_of_dawn.jpg");
        return "album_info";
    }
}
