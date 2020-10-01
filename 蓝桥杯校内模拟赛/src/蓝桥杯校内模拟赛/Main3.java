package 蓝桥杯校内模拟赛;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			if(isok(i))
				sum++;
		System.out.println(sum);
	}

	private static boolean isok(int i) {
		String str=String.valueOf(i);
		char[] arr=str.toCharArray();
		for(int j=1;j<arr.length;j++) {
			if(arr[j]<arr[j-1])
				return false;
		}
		return true;
	}
}