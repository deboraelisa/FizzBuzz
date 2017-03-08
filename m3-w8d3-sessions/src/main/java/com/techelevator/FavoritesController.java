package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import model.FavoriteThings;

@Controller
@SessionAttributes("favoriteThings") //telling the controller what it should have access to, otherwise will have null pointer exception error
public class FavoritesController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showLandingPage(){
		return "landingPage";
	}
	
	
	@RequestMapping(path="/favsPage1", method=RequestMethod.GET)
	public String showFavsPage1(){
		return "favsPage1";
	}
	
	@RequestMapping(path="/favsPage1", method=RequestMethod.POST)
	public String getFavoriteColor(@RequestParam String favColor, ModelMap map) {
		FavoriteThings things = new FavoriteThings();
		things.setColor(favColor);
		
		map.put("favoriteThings", things);
		
		return "redirect:/favsPage2";
	}
	
	@RequestMapping(path="/favsPage2", method=RequestMethod.GET)
	public String showFavsPage2(){
		return "favsPage2";
	}
	
	@RequestMapping(path="/favsPage2", method=RequestMethod.POST)
	public String getFavoriteFood(@RequestParam String favFood, ModelMap map){
		FavoriteThings things = (FavoriteThings)map.get("favoriteThings");
		things.setFood(favFood);
		
		return "redirect:/favsPage3";
	}
	
	@RequestMapping(path="/favsPage3", method=RequestMethod.GET)
	public String showFavsPage3(){
		return "favsPage3";
	}
	
	@RequestMapping(path="/favsPage3", method=RequestMethod.POST)
	public String getFavoriteSeason(@RequestParam String favSeason, ModelMap map){
		FavoriteThings things = (FavoriteThings)map.get("favoriteThings");
	things.setSeason(favSeason);
	
	return "redirect:/summary";
}
	@RequestMapping(path="/summary", method=RequestMethod.GET)
	public String showSummary(){
		return "summary";
		
	}
}