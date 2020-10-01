package 蓝桥杯校内模拟赛;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		int sum=0;
		for(int i=1;i<n;i++) {
			if(arr[i-1]==arr[i])
				sum++;
			else
				break;
		}
		for(int i=n-1;i>0;i--) {
			if(arr[i-1]==arr[i])
				sum++;
			else
				break;
		}
		System.out.println(n-sum-2);
	}
}