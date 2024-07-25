package com.example.mesozoic_eden.dinosaur;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dinosaurs")
public class Dinosaur {
    @Id
    private String id;

    private String dinoSpecies;
    private String dinoEra;
    private String dinoType;
    private String dinoFeature;
    private Double dinoSize;
    private Double dinoWeight;
    private Integer dinoDangerLevel;
    private Integer dinoHealthStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDinoSpecies() {
        return dinoSpecies;
    }

    public void setDinoSpecies(String dinoSpecies) {
        this.dinoSpecies = dinoSpecies;
    }

    public String getDinoEra() {
        return dinoEra;
    }

    public void setDinoEra(String dinoEra) {
        this.dinoEra = dinoEra;
    }

    public String getDinoType() {
        return dinoType;
    }

    public void setDinoType(String dinoType) {
        this.dinoType = dinoType;
    }

    public String getDinoFeature() {
        return dinoFeature;
    }

    public void setDinoFeature(String dinoFeature) {
        this.dinoFeature = dinoFeature;
    }

    public Double getDinoSize() {
        return dinoSize;
    }

    public void setDinoSize(Double dinoSize) {
        this.dinoSize = dinoSize;
    }

    public Double getDinoWeight() {
        return dinoWeight;
    }

    public void setDinoWeight(Double dinoWeight) {
        this.dinoWeight = dinoWeight;
    }

    public Integer getDinoDangerLevel() {
        return dinoDangerLevel;
    }

    public void setDinoDangerLevel(Integer dinoDangerLevel) {
        this.dinoDangerLevel = dinoDangerLevel;
    }

    public Integer getDinoHealthStatus() {
        return dinoHealthStatus;
    }

    public void setDinoHealthStatus(Integer dinoHealthStatus) {
        this.dinoHealthStatus = dinoHealthStatus;
    }
}