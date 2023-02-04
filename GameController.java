package com.aca;

public interface GameController {
	
	String welcomeMessage();
	
	String enterOptionMessage();
		
	void selectUserChoice(GameOption userOption);
	
	GameOption randomCPUChoice();
	
	Player calculateResult();
	
	Score getResults();

}
