package com.sdet.client;
import java.util.Scanner;
import com.sdet.util.*;
import java.sql.*;
import com.sdet.service.*;
import com.sdet.dao.*;
import com.sdet.entities.*;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner in=new Scanner(System.in);
		Players p=new Players();
		int option=0;
		
		do
		{
			System.out.println("Main Menu");
			System.out.println("-----------------------");
			System.out.println("1. Add a player");
			System.out.println("2. Display players");
			System.out.println("3. Exit");	
			System.out.println("-----------------------");
			System.out.print("Enter your input");
			option=in.nextInt();
			System.out.println("-----------------------");
			switch(option)
			{
			case(1):
				System.out.println("Add Player!!");
			System.out.println("-----------------------");
			System.out.print("Enter Player Name:");
			String name=in.next();
			System.out.print("Enter category:");
			String category=in.next();
			System.out.print("Enter highest score:");
			String hiscore=in.next();
			System.out.print("Enter best figure:");
			String bestfig=in.next();
			System.out.print("Enter team name:");
			
			String ptname=in.next();
			p.setName(name);
			p.setNo();
			p.setCategory(category);
			p.setHighScore(hiscore);
			p.setBestFigure(bestfig);
			p.setPtName(ptname);
			SDETServiceImpl obj=new SDETServiceImpl();
			obj.addPlayer(p);
			
			
			
			
				break;
			case(2):
				System.out.println("Display Players");
			System.out.println("--------------------------");
			System.out.print("Enter team name:");
			String tname=in.next();
			SDETServiceImpl obj1=new SDETServiceImpl();
			obj1.displayPlayers(tname);
			
				break;
			case(3):
				System.out.println("Exiting..");
				break;
			default:
				System.out.println("Wrong input, Try again!");
				System.out.println("--------------------------");
				
			}
			
			
		}while(option!=3);
		

	//	service.transferMoney();

	}

}
