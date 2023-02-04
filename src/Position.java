import java.util.Scanner;

public class Position {

	int row;
	int col;
	int a;
	
	void rowCol(int a)
	{
		if(a==1)
			{
				row=0;
				col=0;
			}
		else if(a==2)
		{
			row=0;
			col=1;
		}
		else if(a==3)
		{
			row=0;
			col=2;
		}
		else if(a==4)
		{
			row=1;
			col=0;
		}
		else if(a==5)
		{
			row=1;
			col=1;
		}
		else if(a==6)
		{
			row=1;
			col=2;
		}
		else if(a==7)
		{
			row=2;
			col=0;
		}
		else if(a==8)
		{
			row=2;
			col=1;
		}
		else  if(a==9)
		{
			row=2;
			col=2;
		}
		else {
			System.out.println("\n\n!!Invalid Entry,, please enter the valid position..\n\n");
			Scanner scan = new Scanner(System.in);
			this.a = scan.nextInt();
			rowCol(this.a);
		}
	}
}
