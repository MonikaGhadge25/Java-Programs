/*
Red Light, Green Light - Safe Player Detection
in the Red light, green light game, a player must stop when the doll says "Red Light" and can move only when it says "Green Light"
Given a list of player movements ('1' for Light), find out if any player gets eliminated.
Player maves:[1,0,1,1,0]
Commands: "GRRGG"
Output:
Player 1:Safe
Player 2:Safe
Player 3: eliminated
Player 4: Safe
Player 5: Safe
*/

class Safe_Player_Detection
{
    public static void main(String[] args)
    {
        int command[] ={1,1,0,0,1};
        String lights = "GRGRRG";

        for(int i=0;i<command.length;i++)
        {
            if(command[i]==1 && lights.charAt(i)=='R')
            {
                System.out.println("Player: "+(i+1)+" eliminated");
            }
            else{
                System.out.println("Player: "+(i+1)+" safe");
            }
        }
    }
}