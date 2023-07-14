package com.devesuperior.dslist.services;

import com.devesuperior.dslist.DTO.GameListDTO;
import com.devesuperior.dslist.entities.GameList;
import com.devesuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        // Transforma a lista de game em dto
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
