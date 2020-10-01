package 蓝桥杯校内模拟赛;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[10000];
		int cout=1;
		long sum=n;
		arr[0]=n;
		for(int i=1;i<=n;i++) {
			arr[cout]=i;
			int cha=Math.abs(arr[cout]-arr[cout-1]);
			
				for(int j=1;j<cha;j++) {
					cout++;
					arr[cout]=j;
					sum++;
				}
			
			
			cout=1;
		}
		System.out.println(sum%10000);
	}
}