import java.util.Scanner;
public class CheckBlank 
{
	Scanner scan=new Scanner(System.in);
	void checker(char array[][], char c)
	{
		Position obj = new Position();
		System.out.println(c+ " enter the position");
		obj.rowCol(scan.nextInt());
		
		if (array[obj.row][obj.col]=='_')
		{
			array[obj.row][obj.col]=c;
		}
		else
		{
			System.out.println("invalid entry, enter again "+c);
			checker(array, c);
		}
		
	}
		

}
