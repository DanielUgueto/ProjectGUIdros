package com.example.projektguidros.controllers;


import com.example.projektguidros.models.Presentation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DonerController {

    @GetMapping("/Doner")
    public String donerPage(Model model) {
        Presentation presentation = new Presentation(
                "Donér",
                "Hjælp os med at redde madspild og støtte de udsatte.",
                List.of("/images/friv1.jpg", "/images/friv2.jpg"),
                null
        );

        model.addAttribute("presentation", presentation);
        return "Doner";
    }

}
