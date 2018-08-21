package com.sdet.dao;
import java.sql.*;
import com.sdet.util.*;
import com.sdet.entities.*;
/**
 * 
 * This class implements the methods(rules) defined in SDETDao to interact with
 * database
 *
 */
public class SDETDaoImpl implements SDETDao {

	@Override
	public  void addPlayerDao(Players p) throws SQLException {
		DBUtil db=new DBUtil();
		String Query1="insert into Player (Player_Name, Category, HighestScore, BestFigure) values(?,?,?,?)";
		//System.out.println(p.getPtName());
		String subQ1="select Team_Id from team where Team_Name='"+ p.getPtName() + "'";
		String subQ2="select Player_No from player where Player_Name='"+p.getName()+"'";
		Connection conn=db.getConnection();
		PreparedStatement st=conn.prepareStatement(Query1);
	
		//st.setInt(1, p.getPlayerNo());
		st.setString(1,p.getName());
		st.setString(2,p.getCategory());
		st.setString(3,p.getHighScore());
		st.setString(4, p.getBestFigure());
		st.executeUpdate();
		//
		Statement st2=conn.createStatement();
		ResultSet rs=st2.executeQuery(subQ1);
		rs.next();
		int tid=rs.getInt(1);
		//System.out.println("tid="+tid);
		//
		Statement st3=conn.createStatement();
		ResultSet rs2=st3.executeQuery(subQ2);
		rs2.next();
		int pno=rs2.getInt(1);
		//System.out.println("pno="+pno);
		//
		String Query2="insert into team_player values(?,?)";
		PreparedStatement st4=conn.prepareStatement(Query2);
		st4.setInt(1,pno);
		st4.setInt(2,tid);
		st4.executeUpdate();
		System.out.println();
		System.out.println("Player added successfully with Player Number: "+pno);
		System.out.println("--------------------------");

		}
	
public void displayPlayersDao(String ptname) throws SQLException{
	
	String Query="select Team_Id from Team where Team_Name='"+ptname+"'";
	//System.out.println(ptname);
	DBUtil db=new DBUtil();
	Connection conn=db.getConnection();
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery(Query);
	rs.next();
	int tid=rs.getInt(1);
	//System.out.println("tid=  "+tid);
	//
	String Query1="select Player_No from Team_Player where Team_Id='"+tid+"'";
	Statement st1=conn.createStatement();
	ResultSet rs1=st1.executeQuery(Query1);
	System.out.println("--------------------------");
	 System.out.print(String.format("%-15s %-5s\n","Player Name","Category"));
		System.out.println("--------------------------");

	while(rs1.next())
	{
		int pno=rs1.getInt(1);
		//System.out.println(pno);
		String Query2="select Player_Name, Category from player where Player_No='"+pno+"'";
		Statement st2=conn.createStatement();
		ResultSet rs2=st2.executeQuery(Query2);
		rs2.next();
		 System.out.print(String.format("%-15s %-5s\n",rs2.getString(1),rs2.getString(2)));
		//System.out.println(rs2.getString(1)+"        "+);
	}
	System.out.println("--------------------------");

	}

	
	

}
