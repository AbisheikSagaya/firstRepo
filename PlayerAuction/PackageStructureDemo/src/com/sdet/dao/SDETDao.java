package com.sdet.dao;

import java.sql.SQLException;
import com.sdet.entities.*;

/**
 * 
 * This interface defines the rules to be implemented by the DAO layer to
 * interact with database
 *
 */
public interface SDETDao {

	/*
	 * 
	 */
	void addPlayerDao(Players p)throws SQLException;
	void displayPlayersDao(String tname)throws SQLException;

}
