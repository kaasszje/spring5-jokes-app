package nl.famkrijgsman.spring5jokesapp.controller;

import nl.famkrijgsman.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/",""})
    public String getJokes(Model model) {

        model.addAttribute("joke", jokeService);

        return "index";
    }
}
