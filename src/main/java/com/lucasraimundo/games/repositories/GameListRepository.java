package com.lucasraimundo.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasraimundo.games.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
