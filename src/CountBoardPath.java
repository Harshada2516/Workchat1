
public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
//long s=System.currentTimeMillis();
System.out.println(cbp(0,n));
//long e=System.currentTimeMillis();
//System.out.println(e-s);


	}
public static int cbp(int s,int d)

{
	if(s>d)
	{
		return 0;
	}
	if(s==d)
	{
		return 1;
	}
	int ct=0;
	for(int dice=1;dice<=6;dice++)
	{
		int i=s+dice;
		int c=cbp(i,d);
		ct+=c;
	}
	return ct;
}
}
