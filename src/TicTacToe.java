import java.util.Scanner;

public class TicTacToe 
{
	public static void main(String Args[])
	{
		char arr[][]=new char[3][3];
		Scanner scan=new Scanner(System.in);
		System.out.println("How many times you want to repeat the game? \n");
		int repeat=scan.nextInt();
		System.out.println("OK \n");

		System.out.println("player1 choose 'x' or 'o'");
		int winner=1;
		int p1win=0;
		int p2win=0;
		
		char p1=scan.next().charAt(0);//remember this how to take character input.
		char p2;
		if ( p1=='o')
			p2='x';
		else
			p2='o';
		CheckBlank obj1=new CheckBlank();

		for(int r=0; r<repeat; r++)
		{
			
		for (int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				arr[row][col]='_';//string is shown in double inverted and char in single inverted
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();

		}
		
		System.out.println("imagine the grid as 1 to 9 keypad and choose the position");
		int i=0;
		do
		{
			if (winner==1)
			{
				System.out.println("player1 enter position for symbol "+p1);

			obj1.checker(arr,p1);
			winner=2;
			System.out.println("\n");
			
			for (int row=0; row<3; row++)
			{
				for(int col=0; col<3; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();

			}
			System.out.println("\n");
			
//checking winner first time
			
			if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					{
						System.out.println("............player 1 won............");
						winner=1;
						p1win++;
					}
				if (arr[0][1]==p2)
					{
						System.out.println("............player 2 won............");
						winner=2;
						p2win++;

					}
				break;
			}
			
			if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2]&& arr[1][0]!='_')
			{
				if(arr[1][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;

				}				
				if (arr[1][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2]&& arr[2][0]!='_')
			{
				if(arr[2][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0]&& arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				if (arr[0][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1]&& arr[0][1]!='_')
			{
				if(arr[2][1]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][1]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2]&& arr[0][2]!='_')
			{
				if(arr[0][2]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[0][2]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]&& arr[0][0]!='_')
			{
				if(arr[2][2]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][2]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0]&& arr[0][2]!='_')
			{
				if(arr[2][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			else if(i==8)
			{
				System.out.println("its a tie");
				winner=2;
			}
			i++;
			}
			
			
			
			
			
			if (winner==2)
			{
			System.out.println("player2 enter position for "+p2);
			winner=1;

		
			obj1.checker(arr,p2);
			
			System.out.println("\n");

			
			for (int row=0; row<3; row++)
			{
				for(int col=0; col<3; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();

			}
			System.out.println("\n");
			
			
			if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
					{
						System.out.println("............player 1 won............");
						winner=1;
						p1win++;
					}
				if (arr[0][1]==p2)
					{
						System.out.println("............player 2 won............");
						winner=2;
						p2win++;
					}
				break;
			}
			
			if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2]&& arr[1][0]!='_')
			{
				if(arr[1][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[1][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2]&& arr[2][0]!='_')
			{
				if(arr[2][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0]&& arr[0][0]!='_')
			{
				if(arr[0][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}			
				if (arr[0][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1]&& arr[0][1]!='_')
			{
				if(arr[2][1]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}			
				if (arr[2][1]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2]&& arr[0][2]!='_')
			{
				if(arr[0][2]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[0][2]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]&& arr[0][0]!='_')
			{
				if(arr[2][2]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][2]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			
			if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0]&& arr[0][2]!='_')
			{
				if(arr[2][0]==p1)
				{
					System.out.println("............player 1 won............");
					winner=1;
					p1win++;
				}				
				if (arr[2][0]==p2)
				{
					System.out.println("............player 2 won............");
					winner=2;
					p2win++;
				}				break;
			}
			else if(i==8)
			{
				System.out.println("its a tie");
				winner=2;
			}
			}
			i++;
			
			
		}while(i<9);
		
	
		}
		System.out.println("player one won "+p1win+" times"); 
		System.out.println("player two won "+p2win+" times");
	}
}
