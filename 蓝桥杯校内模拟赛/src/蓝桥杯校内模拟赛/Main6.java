package 蓝桥杯校内模拟赛;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int arr2[]=new int[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=in.nextInt();
			arr[i]=arr2[i];
		}
		Map map=new HashMap();
		for(int i=0;i<n;i++) 
			map.put(arr[i], i);
		Arrays.sort(arr);
		int arr1[]=new int[m];
		for(int j=n-1;j>=n-m;j--)
			arr1[n-1-j]=(int) map.get(arr[j]);
		Arrays.sort(arr1);
		for(int i=0;i<m;i++)
			System.out.print(arr2[arr1[i]]+" ");
	}
}
