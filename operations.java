package virtual;

import java.io.File;
import java.util.*;
public class operations {
	
	 ArrayList <String> l =  new ArrayList <> ();

	public operations()
	{
		File directoryPath = new File("./");
		String contents[] = directoryPath.list();
		for(int i=0; i<contents.length; i++) {
			l.add(contents[i]);
		}
	}

	Scanner sc  =  new Scanner(System.in);
	public  void create() 
	{
		
		
		System.out.println("enter the name of the file add with.txt");
		String s  = sc.next();
		File obj  =  new File(s);
		try 
		{
			if(obj.createNewFile()) 
			{
				l.add(obj.getName());
				System.out.println("File Created :->" + obj.getName());
			}
			else 
			{
				System.out.println("Aready Exit");
			}
		}
		catch(Exception e) 
		{
			System.out.println("error:- >"+e);
		}
	}
	  void display() 
	{
		  for(int i=0;i<l.size();i++) 
		  {
			  for(int j=0;j<l.size()-1;j++) 
			  {
				  
				  if(l.get(j).compareTo(l.get(j+1))>0) 
				  {
					  String temp = l.get(j);
					  l.set(j,l.get(j+1));
					  l.set(j+1, temp);
					  
				  }
			  }
		  }
		System.out.println(l);
	}
	  ArrayList<String> search()
	  {
		  System.out.println("enter the file name which file you want to search");
		  String sea = sc.next();
		  ArrayList<String > a =  new ArrayList<>();
		  int c=0;
		  int index=0;
		  for(int i=0;i<l.size();i++) 
		  {
			  if(l.get(i).equalsIgnoreCase(sea)) 
			  {
				  a.add(l.get(i));
				  c++;
				  index=i;
				  
			  }
			 
		  }
		  return a;

		  
	  }
	  void delete() 
	  {
		  System.out.println("enter file name");
		  String s  =sc.next();
		
		 
		  File obj2  =  new File("./" + s);
		  
		  
			 if (obj2.delete()) {
				 System.out.println("Deleted the file: " + obj2.getName());
				 for (String E: l
					  ) {
					 if(E.equalsIgnoreCase(s))
					 {
						 l.remove(E);
						 return;

					 }
				 }


			    } else {
			      System.out.println("File not found");
			    } 
	  }
	
   void endScreen() 
   {
	   System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("*                                               *");
		System.out.println("*    THANK YOU FOR VISITING LOCKEDME.COM        *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("\n\n");
		System.exit(0);
   }


}