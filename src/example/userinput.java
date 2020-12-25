package example;
import java.io.*;  
public class userinput {  
    public static void main(String args[])throws Exception{      
    	System.out.println("enter number:");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	System.out.println(n);
    }    
} 
