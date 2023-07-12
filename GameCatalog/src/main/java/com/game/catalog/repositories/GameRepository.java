package com.game.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.catalog.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
