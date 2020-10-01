package 蓝桥杯校内模拟赛;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int sum=0;
			for(int i=1;i<Math.sqrt(1200000);i++)
				if(1200000%i==0)
					sum++;
			System.out.println(sum);
			
	}

	private static boolean f(int i) {
		while(i>0) {
			int mod=i%10;
			if(mod==9)
				return true;
			i=i/10;
		}
		return false;
	}
}