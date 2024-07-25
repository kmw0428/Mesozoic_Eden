package com.example.mesozoic_eden.dinosaur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinosaurService {

    private final DinosaurRepository dinosaurRepository;

    @Autowired
    public DinosaurService(DinosaurRepository dinosaurRepository) {
        this.dinosaurRepository = dinosaurRepository;
    }

    public List<Dinosaur> getAllDinosaurs() {
        return dinosaurRepository.findAll();
    }

    public List<Dinosaur> getDinoByType(String dinoType) {
        return dinosaurRepository.findByDinoType(dinoType);
    }
}
