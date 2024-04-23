package com.website.pinkFloyd.controllers;

import com.website.pinkFloyd.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AlbumInfoController {

    @Autowired
    private AlbumService albumService;
    @GetMapping("/album-info/{albumName}")
    public String getAlbum(@PathVariable String albumName, Model model) {
        albumService.createAlbumPage(model, albumName);
        return "album_info";
    }
}
