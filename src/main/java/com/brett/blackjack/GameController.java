package com.brett.blackjack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class GameController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to Blackjack! Click to start a new game");
		return "mainMenu";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String startNewGame(ModelMap model){
        model.addAttribute("game", new BlackJackGame());
        return "blackjack";
    }


}