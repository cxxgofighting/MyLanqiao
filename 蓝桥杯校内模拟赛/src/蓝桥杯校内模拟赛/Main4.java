package 蓝桥杯校内模拟赛;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		String arr1[]=new String[n];
		String arr[][]=new String[n][m];
		for(int i=0;i<n;i++)
			arr1[i]=in.next();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=arr1[i].charAt(j)+"";
		int k=in.nextInt();
		int dec[][]= {{-1,0},{1,0},{0,1},{0,-1}};
		for(int i=0;i<k;i++) {
			String pos="";
			for(int a=0;a<n;a++)
				for(int j=0;j<m;j++)
					if(arr[a][j].equals("g"))
						pos=pos+a+" "+j+",";
			String temp1[]=pos.split(",");
			for(int a=0;a<temp1.length;a++) {
				String temp2[]=temp1[a].split(" ");
				int posx=Integer.parseInt(temp2[0]);
				int posy=Integer.parseInt(temp2[1]);
				for(int b=0;b<4;b++) {
					int posx1=posx+dec[b][0];
					int posy1=posy+dec[b][1];
					if(posx1>=0 && posx1<n && posy1>=0 && posy1<m) {
						if(arr[posx1][posy1].equals(".")) {
							arr[posx1][posy1]="g";
						}
					}else
						continue;
				}
			}
		}
		for(int a=0;a<n;a++) {
			for(int j=0;j<m;j++)
				System.out.print(arr[a][j]);
			System.out.println();
		}
	}
}