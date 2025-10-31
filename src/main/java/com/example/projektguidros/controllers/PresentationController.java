package com.example.projektguidros.controllers;

import com.example.projektguidros.models.Presentation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PresentationController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        Presentation presentation = new Presentation(
                "hej i titlen",
                "hej igen men som beskrivelse",
                //tilføj billede her feks
                List.of(),
                null
        );
        model.addAttribute("presentation", presentation);
        return "index";
    }

    @GetMapping({"/om-os"})
    public String showAbout() {
        return "om-os";
    }

    @GetMapping({"/Login"})
    public String ShowLogin() {
        return "Login";
    }

    @GetMapping("/Modtager")
    public String showModtagerPage() {
        return "Modtager"; // Returnerer Modtager.html
    }

        @GetMapping({"/Restaurant"})
        public String showRestaurant() {
            return "Restaurant";
        }

}
