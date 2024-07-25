package com.example.mesozoic_eden.dinosaur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
@RequestMapping("/dinosaurs")
public class DinosaurController {

    @Autowired
    private DinosaurService dinosaurService;

    @GetMapping
    public List<Dinosaur> getAllDinosaurs() {
        return dinosaurService.getAllDinosaurs();
    }

    @GetMapping("/{type}")
    public String getDinoByType(@PathVariable String type, Model model) {
        List<Dinosaur> dinosaurs = dinosaurService.getDinoByType(type);
        model.addAttribute("dinosaurs", dinosaurs);
        model.addAttribute("type", type);
        return "dinoProfile"; // Thymeleaf 템플릿 이름
    }
}