package 蓝桥杯校内模拟赛;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char arr[]=str.toCharArray();
		int len=str.length();
		int arr1[]=new int[len];
		int sum=0;
		for(int i=0;i<len;i++) 
			if(!isyuanyin(arr[i])) {
				sum++;
				arr1[i]=sum;
			}else {
				sum--;
				arr1[i]=sum;
			}
		if(arr1[0]>0) {
			int cout1=0;
			int cout2=1;
			boolean raise=true;
			boolean xia=false;
			for(int i=1;i<len;i++) {
				if(arr1[i]<arr1[i-1] && raise) {
					cout1++;
					raise=false;
					xia=true;
				}else if(arr1[i]>arr1[i-1] && xia){
					cout2++;
					raise=true;
					xia=false;
				}
			}
			if(cout1==2 && cout2==2)
				System.out.println("yes");
			else
				System.out.println("no");
		}else
			System.out.println("no");
	}

	private static boolean isyuanyin(char a) {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			return true;
		return false;
	}
}
