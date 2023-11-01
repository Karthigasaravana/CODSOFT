package CODSOFT;
import java.util.*;
public class Numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Let's play a guessing game, my friend!");
		int round = 1;
		int win = 0;
		while(true)
		{
			System.out.println("Let's step into the round "+round+" : ");
			int chances = 10;
			System.out.println("You have the opportunity to make 10 attempts to accurately guess the mystery number within the range of 1 to 100.");
			System.out.println("Should your guess prove to be correct, you'll be declared the winner of this round.");
			System.out.println("Best of luck!!!");
			int i = 1;
			int min = 1;
			int max = 100;
			int target = rd.nextInt(max-min+1)+min;
			for(i=1;i<=10;i++)
			{
				System.out.println();
				System.out.println("Chance "+i+" Type your guess number here.");
				int num = sc.nextInt();
				System.out.println();
				if(num>target) System.out.println("Your guess number is too high!!");
				else if(num<target) System.out.println("Your guess number is too low");
				else
				{
					System.out.println("Congratulatios!! you guessed the number correctly and won the round "+round+" just by "+i+" chances...");
					win++;
					break;
				}
				chances--;
				if(chances>0) System.out.println("Don't give up; you still have chances to succeed "+chances+"");
			}
			System.out.println();
			if(chances == 0) 
			{
				System.out.println("Oops! You may have lost this round, but don't give up—there's always another round to conquer!");
				System.out.println("Better Luck Next Time!");
				System.out.println();
			}
			System.out.println("Total rounds completed : "+round);
			System.out.println("Total rounds won : "+win);
			System.out.println();
			System.out.println("Don't leave your hope!!!");
			System.out.println("Do you want to play again: Yes or No");
			sc.nextLine();
			String s = sc.nextLine().toLowerCase();
			if(s.equals("no")) 
			{
				System.out.println();
				System.out.println("Thanks for making your brain thinking more.. See you later!!");
				System.out.println();
				System.out.println("Have a Nice Day :) ");
				break;
			}
			round++;
		}
	}
}

	