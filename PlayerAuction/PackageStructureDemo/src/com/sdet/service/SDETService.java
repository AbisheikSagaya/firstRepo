package com.sdet.service;
import java.sql.SQLException;
import com.sdet.entities.*;
/**
 * 
 * This interface defines the rules to be implemented as business layer
 */
public interface SDETService {

	public void addPlayer(Players p) throws SQLException;
	public void displayPlayers(String tname) throws SQLException;

}
