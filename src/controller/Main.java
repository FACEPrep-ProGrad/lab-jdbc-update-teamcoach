package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import dao.TeamDAO;
import model.Team;

public class Main{
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		TeamDAO teamdao=new TeamDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// first viewing all teamlist names and coach names to user
//		System.out.println("Team List Name"+"\t\t\t\t\t"+"Coach");
		System.out.format("%-5s %30s\n", "Team List Name", "Coach");
		TeamDAO.displayTeams(null);
		
		// Taking team name from user for which coach name is to be updated 
				System.out.println("Enter the team name you want update");
		String teamname=br.readLine();
		
		// Taking coach name from user which is to update
		System.out.println("Enter the new coach name you want update");
		String updatecoach=br.readLine();
		
		Team team=new Team(teamname, updatecoach);
		team.setTeamName(teamname);
		team.setCoachName(updatecoach);
		teamdao.updateTeamDetails(teamname, updatecoach);
		System.out.println("Updated team list");
		System.out.format("%-5s %30s\n", "Name", "Coach");
		TeamDAO.displayTeams(null);
	}
}