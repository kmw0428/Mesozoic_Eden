package com.example.mesozoic_eden.dinosaur;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DinosaurRepository extends MongoRepository<Dinosaur, String> {
    List<Dinosaur> findByDinoType(String dinoType);
}