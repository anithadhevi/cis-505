/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Student 2021*/

package Module_2.SportsTeamApp;
import java.util.Scanner;

public class Team
{
    private String teamName= "";// default is empty
    private String[] Players=new String[20];// default is 20
    private int playerCount=0;//default is 0


    //Argument constructor creates a team using the teamName data field as an argument
    public Team(String teamName)
    {
        this.teamName=teamName;
    }

    //public method to add a player to the players data field
    public void addPlayer(String playerName)
    {
        if (playerCount < Players.length)
        {
            Players[playerCount]=playerName;
            playerCount++;
        }
        else
        {
            System.out.println("The Team is full, cannot add more players");
        }
    }

    //public string array method to return the players data field
    public String [] getPlayers()
    {
        return Players;
    }

    //public int method to return the playerCount data field
    public int getPlayerCount()
    {
        return playerCount;
    }

    //public string method to return the teamName data field
    public String getTeamName()
    {
        return teamName;
    }
}