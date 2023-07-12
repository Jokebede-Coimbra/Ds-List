package com.devesuperior.dslist.services;

import com.devesuperior.dslist.DTO.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // Transforma a lista de game em dto
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
