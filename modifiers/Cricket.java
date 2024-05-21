package com.modifiers;

class Game{
	void type()
	{
		System.out.println("Inddoor game and outdoor game");
	}
}
public class Cricket extends Game {

	void type()
	{
		System.out.println("outdoor");
	}
	public static void main(String[] args) {
		
		Game g = new Game();
		g.type();
		
		Cricket c = new Cricket();
		c.type();//cricket
		c.type();//game
	}
}
