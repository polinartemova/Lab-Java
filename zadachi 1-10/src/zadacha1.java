import java.io.IOException;
import java.util.Scanner;
public class zadacha1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println("������ �1");
		System.out.println("������� ������ �����");
		int x=in.nextInt();
		System.out.println("������� ������ �����");
		int y=in.nextInt();
		remainder( x,  y);
	
		System.out.println("������ �2");
		System.out.println("������� ��������� ������������ ");
		int a=in.nextInt();
		System.out.println("������� ������ ������������ ");
		int h=in.nextInt();
		triArea(a,h);
		
		System.out.println("������ �3");
		System.out.println("������� ���������� ����� ");
		int chik=in.nextInt();
		System.out.println("������� ���������� ����� ");
		int cows=in.nextInt();
		System.out.println("������� ���������� ������ ");
		int pigs=in.nextInt();
		animals( chik,cows, pigs);
		
		System.out.println("������ �4");
		System.out.println("������� ������ ����� ");
		float prob=in.nextFloat();
		System.out.println("������� ������ ����� ");
		float prize=in.nextFloat();
		System.out.println("������� ������ ����� ");
		float pay=in.nextFloat();
		System.out.println(profitableGamble( prob, prize,pay));
		
		System.out.println("������ �5");
		System.out.println("������� ������ �����");
		int N=in.nextInt();
		System.out.println("������� ������ �����");
		int aa=in.nextInt();
		System.out.println("������� ������ �����");
		int bb=in.nextInt();
		operation( N, aa, bb);
		
		System.out.println("������ �6");
		System.out.println("������� ������");
		int xx= System.in.read();
		char c=(char) xx;
		System.out.println("��� �������:"+c+"="+xx);
		
		System.out.println("������ �7");
		System.out.println("������� �����");
		int n=in.nextInt();
		System.out.println("����� ���� ����� �� 1 �� ���������� ����� =");
		System.out.println(addUpto( n));
		
		System.out.println("������ �8");
		System.out.println("������� ����� ����� ������� ������������");
	    int a1=in.nextInt();
		System.out.println("������� ����� ������ ������� ������������");
		int b1=in.nextInt();
		nextEdge(a1,b1);
		

		System.out.println("������ �9");
		System.out.println("������� ������ �������");
		int size=in.nextInt();
		int sum=0;
		int sum1=0;
		int array[] =new int [size];
		System.out.println("������� �������� �������");
		for (int i=0;i<size;i++)
		{ array[i]=in.nextInt();
		}
		
		for ( int num: array )
		{   sum=num*num*num;
			sum1=sum1+sum;
		}
		
		System.out.println("����� ����� ������� = "+sum1);
		
		
		System.out.println("������ �10");
		System.out.println("������� ����� a");
		double a2=in.nextDouble();
		System.out.println("������� ����� b");
		double b2=in.nextDouble();
		System.out.println("������� ����� c");
		double c2=in.nextDouble();
		abcmath(a2, b2, c2);
		
		in.close();
	}	
	static	void remainder(int x, int y)
		{ 
		
		int c = x % y;
		System.out.println("������� �� ������� = ");
		System.out.println(c);	
	}
	static	void triArea(int a, int h)
	{   
		int S=(a*h)/2;
		System.out.println("������� ����������� =");
		System.out.println(S);	
	}
	static	void animals(int chik, int cows,int pigs)
	{   
		int sum=2*chik+4*cows+4*pigs;
		System.out.println("����� ���������� ��� ���� ��������=");
		System.out.println(sum);	
	}
	static	boolean profitableGamble(float prob, float prize,float pay)
	{   if (prob*prize>pay)
		{
		return true;
		}
	else
		{
		return false;
		}
			
	}
	static void operation(int N, int aa, int bb)
	{   
		if (aa+bb==N)
		{
			System.out.println("��������") ;
			return;}
		if (aa-bb==N)
		{	System.out.println("���������");
			return ;}
		if (aa*bb==N)
		{	System.out.println("���������");
			return ;}
		else if(aa/bb==N)
		{	System.out.println("�������");
			return ;}
		else 
		{	System.out.println("none");
			return;}	
		
	}
	 public static int addUpto(int n)
	  {
		return n*(n+1)/2;
		
	  }
	
	 static void nextEdge(int a1,int b1)
		{   int c=a1+b1-1;
			System.out.println("����� ������� ������� ������������ = "+c);
			
			
		}
	 
	 static	void abcmath(double a2,double b2,double c2)
		{   
			for (int i=1;i<=b2;i++)
			{ 
				a2=a2+a2;
			}
			System.out.println("���������� ����� = "+a2);
			if (a2%c2==0)
			{
				System.out.println("true");
			}
		else
			{
			System.out.println("false");
			}
				
		}
}
