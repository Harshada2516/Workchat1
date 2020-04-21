//Minimum Palindromic cut memoized
public class MinPaliCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s="abccbc";
		int[][] a=new int[s.length()][s.length()];
		int p=mcp(s,0,s.length()-1,a);
		System.out.println(p);

	}
	
	
	
	public static int mcp(String str,int s,int d,int[][] qb)
	{
		
		if(is(str,s,d)==true)
		{
			return 0;
		}
		if(qb[s][d]!=0)
		{
			return qb[s][d];
		}
		int mcp=Integer.MAX_VALUE;
		for(int i=s;i<d;i++)
		{
			int m1=mcp(str,s,i,qb);
			int m2=mcp(str,i+1,d,qb);
			int t=m1+m2+1;
			if(t<mcp)
			{
				mcp=t;
			}
		}
		
		qb[s][d]= mcp;
		return mcp;
		
	}
	public static boolean is(String str,int s,int d)
	{
		int l=s,r=d;
		while(l<r)
		{
			if(str.charAt(l)!=str.charAt(r))
			return false;
			l++;
			r--;
		}
		return true;
	}

}
