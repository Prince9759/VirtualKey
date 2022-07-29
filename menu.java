package virtual;
import java.util.*;

public class menu {

	void screen() 
	{
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("*      DEVELOPED BY PRINCE JAIN     *");
		System.out.println("*************************************************");
		System.out.println("*               VirtualKey.COM                    *");
		System.out.println("*************************************************");
		System.out.println("*   Directory: " + Main.path +"    *");
		System.out.println("*************************************************");
		System.out.println("\n\n");
		
	}
	
	void mainmenu() 
	{
		operations obj  =  new operations();
		Scanner sc =new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("enter choice you want whih operation");
			System.out.println("press-1 for create the file.");
			System.out.println("press-2 for display all the file that you created");
			System.out.println("press-3 for searching   the file that you want to search ");
			System.out.println("press-4 for delete   the file that you want to delete");
			System.out.println("press-5 for exit");
			
			int n  = sc.nextInt();
			switch(n) 
			{
			case 1:
				  obj.create();
				  break;
			case 2:
				obj.display();
				break;
			case 3:
				ArrayList <String> a = obj.search();
				if(a.size()>0)
				{

					// System.out.println(a);
					System.out.println("file exists: " + a);

				}
				else
				{
					System.out.println("file not found");
				}
				break;
			case 4:
				obj.delete();
				break;
			case 5:
				
				obj.endScreen();
				break;
				
			}
			
			
		}

	
	}

}
