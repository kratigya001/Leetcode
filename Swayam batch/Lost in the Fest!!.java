
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	//	int arr[]=new int [n];
		while(t --> 0){
		    int n=sc.nextInt();
		   	int arr[]=new int [n];

		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int bh=arr[n-1];
		    int swap=0;
		    for(int i=n-2;i>=0;i--){
		        if(arr[i]>=bh){
		            swap=(n-1)-i;
		        }
		    }

		    System.out.println(swap);
		    
		}

	}
}
