/*
Marbles in the Glass Bridge
Each player gets a random number os Marbles befor crossing the Glass Bridge. if they land on a fragile step (even-numbered index),
they lose half their marbels. if they reach the end with more than 5 marbels, they survive

Input: 
Marbels: [10,7,15,4,20]
Output:
player 1: eliminated
player 2: survives
player 3: survives
player 4: eliminated
player 5: survives
*/

class Marbles_in_Glass_Bridge
{
    public static void main(String[] args)
    {
        int[] arr={10,7,15,4,20};
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]/2;//updation
                System.out.println("Player"+(i+1)+":"+(arr[i]>5?"Survive":"Eliminated"));
            }
        }
        

    }
}