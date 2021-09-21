package Assignment;

public class MissingNumber {
	
	public static void main(String args[])
	{
		int x[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		int y=x.length+1;
		int z=y*(y+1)/2;
		int add=0;
		for(int i=0;i<x.length;i++)
		{
			add=add+x[i];   
		}
	    	System.out.print("missing number is = "+(z-add));
		}	

}
