package com.lucasraimundo.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasraimundo.games.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
