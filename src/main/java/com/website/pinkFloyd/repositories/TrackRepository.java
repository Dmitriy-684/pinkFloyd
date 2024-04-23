package com.website.pinkFloyd.repositories;

import com.website.pinkFloyd.entities.TrackEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends CrudRepository<TrackEntity, Integer> {

    TrackEntity getTrackEntityByName(String name);
}
