package P2;

import java.util.Scanner;

public class Second {
	public static int findMaxDistance(int[] arr, int n) {
		int diff=0;
		int maxDiff = Integer.MIN_VALUE;
		int max = 0;
		for(int i=0;i<n-1;i++) {
			diff = Math.abs(arr[i]-arr[i+1]);
			if(maxDiff<diff) {
				maxDiff = diff;
				if(arr[i]>arr[i+1]) max = i;
				else max = i+1;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
  		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int result = findMaxDistance(arr, n);
        System.out.println(result); 

        s.close();
	}

}
