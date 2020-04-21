import java.util.*;
public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]=new int[] {1, 5, 8, 9, 10, 17, 17, 20};
		int a[]=new int[] {0,3,5,6,15,10,25,12,24};
		System.out.println(rcm(a,8,new int[a.length]));

	}
	
	public static int rcm(int[] a,int r1,int[] b)
	{
		int msp=a[r1];
		int l=1;
		int r=r1-1;
		if(r1==0)
		{
			return 0;
		}
		if(b[r1]!=0)
		{
			return b[r1];
		}
		while(l<=r)
		{
			int mspl=rcm(a,l,b);
			int mspr=rcm(a,r,b);
		if(mspl+mspr>msp)
		{
			msp=mspl+mspr;
		}
		l++;
		r--;
		}
		b[r1]=msp;
		return msp;
	}
}
