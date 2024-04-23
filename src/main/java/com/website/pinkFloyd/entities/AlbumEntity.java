package com.website.pinkFloyd.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "albums", schema = "pink_floyd")
public class AlbumEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name="info")
    private String info;

    @OneToMany(mappedBy = "album")
    private Set<TrackEntity> tracks = new LinkedHashSet<>();

    public Set<TrackEntity> getTracks() {
        return tracks;
    }

    public void setTracks(Set<TrackEntity> tracks) {
        this.tracks = tracks;
    }

    public int getId(){ return id; }

    public void setId(int id) { this.id = id; }

    public String getInfo(){ return info; }

    public String[] getPrettyInfo(){
        return info.split("\\(абзац\\)");
    }
    public void setInfo(String info) { this.info = info; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}
