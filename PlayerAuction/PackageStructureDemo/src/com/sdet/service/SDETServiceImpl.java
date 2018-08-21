package com.sdet.service;
import java.sql.SQLException;
import com.sdet.dao.*;
import com.sdet.entities.*;

/**
 * This class implements the business rules defined for business layer in
 * SDETService interface
 *
 */
public class SDETServiceImpl implements SDETService {

	@Override
	public void addPlayer(Players p)throws SQLException
	{

		SDETDao dao = new SDETDaoImpl();
		dao.addPlayerDao(p);

	}
	public void displayPlayers(String tname)throws SQLException
	{

		SDETDao dao = new SDETDaoImpl();
		dao.displayPlayersDao(tname);
	}

}
