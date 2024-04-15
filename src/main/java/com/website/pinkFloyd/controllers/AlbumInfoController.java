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
        AlbumEntity albumEntity = albumService.getByName("A Momentary Lapse Of Reason");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/a_momentary_lapse_of_reason.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/a-momentary-lapse-of-reason");
        return "album_info";
    }

    @GetMapping("/the-final-cut")
    public String finalCut(Model model){
        AlbumEntity albumEntity = albumService.getByName("The Final Cut");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_final_cut.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-final-cut");
        return "album_info";
    }

    @GetMapping("/the-wall")
    public String wall(Model model)
    {
        AlbumEntity albumEntity = albumService.getByName("The Wall");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_wall.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-wall");
        return "album_info";
    }

    @GetMapping("/animals")
    public String animals(Model model){
        AlbumEntity albumEntity = albumService.getByName("Animals");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/animals.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/animals");
        return "album_info";
    }

    @GetMapping("/wish-you-were-here")
    public String wereHere(Model model){
        AlbumEntity albumEntity = albumService.getByName("Wish You Were Here");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/wish_you_were_here.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/wish-you-were-here");
        return "album_info";

    }

    @GetMapping("/the-dark-side-of-the-moon")
    public String darkSide(Model model){
        AlbumEntity albumEntity = albumService.getByName("The Dark Side Of The Moon");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_dark_side_of_the_moon.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-dark-side-of-the-moon");
        return "album_info";

    }

    @GetMapping("/meddle")
    public String meddle(Model model){
        AlbumEntity albumEntity = albumService.getByName("Meddle");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/meddle.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/meddle");
        return "album_info";
    }

    @GetMapping("/atom-heart-mother")
    public String atomHeart(Model model)
    {
        AlbumEntity albumEntity = albumService.getByName("Atom Heart Mother");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/atom_heart_mother.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/atom-heart-mother");
        return "album_info";
    }

    @GetMapping("/ummagumma")
    public String ummagumma(Model model){
        AlbumEntity albumEntity = albumService.getByName("Ummagumma");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/ummagumma.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/ummagumma");
        return "album_info";
    }

    @GetMapping("/a-saucerful-of-secrets")
    public String secrets(Model model){
        AlbumEntity albumEntity = albumService.getByName("A Saucerful Of Secrets");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/a_saucerful_of_secrets.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/a-saucerful-of-secrets");
        return "album_info";
    }

    @GetMapping("/the-piper-at-the-gates-of-dawn")
    public String piper(Model model){
        AlbumEntity albumEntity = albumService.getByName("The Piper At The Gates Of Dawn");
        String[] paragraphs = albumEntity.getPrettyInfo();
        model.addAttribute("albumName", albumEntity.getName());
        model.addAttribute("albumCover", "../images/covers/the_piper_at_the_gates_of_dawn.jpg");
//        model.addAttribute("infoParagraph1", paragraphs[0]);
//        model.addAttribute("infoParagraph2", paragraphs[1]);
//        model.addAttribute("infoParagraph3", paragraphs[2]);
        model.addAttribute("trackRef", "http://localhost:8080/track-list/the-piper-at-the-gates-of-dawn");
        return "album_info";
    }
}
