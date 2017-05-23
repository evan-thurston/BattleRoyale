package game.Menus;

import java.awt.image.BufferedImage;

import game.IOpponent;

public interface IScreen
{
	public Screen getGame(); 
	
	public Screen getNewGame();
	
	public Screen getPause();
	
	public Screen getStageSelect();
	
	public Screen getChampSelect();
	
	public Screen getControls();
	
	public Screen getStop();
	
	public Screen getMenu();

	public Screen getScreen();
	
	public Screen getPrevScreen();

	public void setScreen(Screen screen, boolean doReset);
	
	public void setPlayer(IOpponent p);
	
	public void setBackground(BufferedImage b);

}