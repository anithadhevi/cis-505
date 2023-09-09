package Module_2.SportsTeamApp;
import java.util.Scanner;

public class TestSportsTeamApp
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            //prompt the user to enter the team
            System.out.print("Enter a team name: ");
            String teamName= scanner.nextLine();
   
            //create a Team object with entered team Name
            Team team=new Team(teamName);

            // prompt the user to enter player names comma seperated,no space
            System.out.println("");
            System.out.println("Enter player names:" );
            
            System.out.println("hint :use commas for multiple players; no spaces>: steve,jon");
            
            String playerNames=scanner.nextLine();

            //split the player name by commas and add them to the team
            String[] Players= playerNames.split( "," );
            for (String playerName : Players)
            {
                team.addPlayer(playerName.trim());//trim to remove leading trailing spaces
            }

            //Display team information
            System.out.println("");
            System.out.println("---Team Summary---");
            System.out.println("Number of Players in the team:  "+team.getPlayerCount());
            String printNames = "Players on team : ";
            for (int i=0; i< team.getPlayers().length; i++)
            {
                if (team.getPlayers()[i] != null)
                {
                    printNames = printNames + team.getPlayers()[i] + ", ";
                }
            }
            System.out.println("Players on team : " + printNames.substring(0, printNames.length()-2));
        
            //prompt the user to continue or not
            System.out.println("");
            System.out.print("Do you want to continue? (y/n): ");
            String continueInput= scanner.nextLine().toLowerCase();

            if (!continueInput.equals("y"))
            {
                break;
            }  
        }

        System.out.println("End of line...");
        scanner.close();

    }
}

