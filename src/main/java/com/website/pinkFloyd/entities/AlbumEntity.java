package com.website.pinkFloyd.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "albums")
public class AlbumEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name="info")
    private String info;

    public AlbumEntity(){}

    public AlbumEntity(String name, String info) {
        this.name = name;
        this.info = info;
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
