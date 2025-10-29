package com.example.projektguidros.controllers;


import com.example.projektguidros.models.Presentation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class FrivilligController {

    @GetMapping("/Frivillig")
    public String frivilligPage(Model model) {
        Presentation presentation = new Presentation(
                "Frivillig",
                "Bliv frivillig og lav en reél forandring i dit lokale fællesskab.",
                List.of("/images/vol0.jpg", "/images/vol2.jpg"),
                null
        );

        model.addAttribute("presentation", presentation);
        return "Frivillig";
    }

}