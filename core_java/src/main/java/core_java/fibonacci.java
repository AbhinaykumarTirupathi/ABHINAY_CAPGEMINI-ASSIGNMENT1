package core_java;

public class fibonacci
{

	public static void main(String[] args)
	{
		int a=0,b=1,c,i,count=10;    
		 System.out.print(a+" "+b);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)    
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;
		 }
	}

}
