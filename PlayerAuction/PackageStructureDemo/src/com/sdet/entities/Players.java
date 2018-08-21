package com.sdet.entities;

/**
 * 
 * This is an example of entity class. Various entities interact with each other
 * to fulfill the business scenario. An entity class must have private
 * attributes, constructors for initialization, getters setters methods.
 * 
 * It may also implement equals and hashCode methods inherited from Object class
 * to implement comparison
 */
public class Players {
	static int playerNo=0;
	String playerName;
	String category;
	String highScore;
	String bestFigure;
	String ptName;
	public void setName(String playerName)
	{
		this.playerName=playerName;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public void setHighScore(String highScore)
	{
		this.highScore=highScore;
	}
	public void setBestFigure(String bestFigure)
	{
		this.bestFigure=bestFigure;
	}
	public void setNo()
	{
		playerNo++;
	}
	public void setPtName(String ptName)
	{
		this.ptName=ptName;
	}
	public String getName()
	{
		return playerName;
	}
	public String getCategory()
	{
		return category;
	}
	public String getHighScore()
	{
		return highScore;
	}
	public String getBestFigure()
	{
		return bestFigure;
	}
	public int getPlayerNo()
	{
		return playerNo;
	}
	public String getPtName()
	{
		return ptName;
	}
}
