package com.etc.mplist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etc.mplist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
