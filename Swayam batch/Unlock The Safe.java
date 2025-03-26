import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] t1 = new int[n];
		    for(int i=0; i<n; i++){
		        t1[i] = sc.nextInt();
		    }
		    int[] t2 = new int[n];
		    
		    for(int i=0; i<n; i++){
		        t2[i] = sc.nextInt();
		    }
		    
		    int total = 0;
		    int[] extra = new int[n];
		    for(int i=0; i<n; i++){
		        int d = Math.abs(t1[i] - t2[i]);
		        total = total + Math.min(d , 9 - d);
		        extra[i] = Math.max(d,9-d) - Math.min(d,9-d);
		    }
		    
		  //  System.out.println(total);
		    
		    if(total > k){
		        System.out.println("No");
		    }else if(total == k){
		        System.out.println("Yes");
		    }else{
		        int r = k - total;

		        if(r %2 == 0 ){
		            System.out.println("Yes");
		        }else{
		            boolean flag = false;
		        for(int i : extra){
		            if(i%2==1 && i<=r) {
		                flag = true;
		                break;
		            }
		        }
		        if(flag)System.out.println("Yes");
		        else System.out.println("No");
		        }
		        
		    }
		}

	}
}