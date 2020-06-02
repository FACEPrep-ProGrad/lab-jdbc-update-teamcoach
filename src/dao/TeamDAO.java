package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Team;
import utility.ConnectionManager;

public class  TeamDAO{
	// Method used to get all the users from the database
	public List<Team> getAllTeams() throws ClassNotFoundException, SQLException {
		return null;

		
	}
	// Method used to update the team's coach details (coach name)
	public void updateTeamDetails(String teamName,String coachName) throws ClassNotFoundException, SQLException {
		
	
		String sql1="update PPLDL62 set coach=? where team_list_name=?";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql1);
		
		ps.setString(1, coachName);
		ps.setString(2, teamName);
		ps.executeUpdate();

		
	}
	// Method used to display the team coach details
	public static void displayTeams(List<Team> teamList) throws ClassNotFoundException, SQLException {
		
		String sql="select * from PPLDL62";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
//			System.out.println(rs.getString(1)+"\t\t\t\t\t"+rs.getString(2));
			System.out.format("%10s %40s\n", rs.getString(1), rs.getString(2));
		}
	}
	
}