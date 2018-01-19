//My solution to the HackerRank problem: "Apple and Orange" 
//  https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.Scanner;

public class AppleAndOrangeApp {
    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
    	
    	int[] temp = new int[2];
    	for(int i =0; i < apple.length; i++) {
    		System.out.println("a + apple[i] = "+ (a + apple[i]));
    		if((a + apple[i] >= s) && (a + apple[i] <= t))
    		temp[0]++;
    	}
    	
    	for(int j =0; j < orange.length; j++) {
    		System.out.println("b + orange[i] = "+ (b + orange[j]));
    		if((b + orange[j] >= s) && (b + orange[j] <= t))
    		temp[1]++;
    	}
    	return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for s: ");
        int s = in.nextInt();
        System.out.print("Enter a value for t: ");        
        int t = in.nextInt();
        System.out.print("Enter a value for a: ");        
        int a = in.nextInt();
        System.out.print("Enter a value for b: ");        
        int b = in.nextInt();
        System.out.print("Enter a value for m: ");        
        int m = in.nextInt();
        System.out.print("Enter a value for n: ");        
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
        	System.out.print("Enter a value for apple: ");
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
        	System.out.print("Enter a value for orange: ");        	
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
