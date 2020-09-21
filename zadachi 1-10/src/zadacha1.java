import java.io.IOException;
import java.util.Scanner;
public class zadacha1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println("Задача №1");
		System.out.println("Введите первое число");
		int x=in.nextInt();
		System.out.println("Введите второе число");
		int y=in.nextInt();
		remainder( x,  y);
	
		System.out.println("Задача №2");
		System.out.println("Введите основание треугольника ");
		int a=in.nextInt();
		System.out.println("Введите высоту треугольника ");
		int h=in.nextInt();
		triArea(a,h);
		
		System.out.println("Задача №3");
		System.out.println("Введите количество куриц ");
		int chik=in.nextInt();
		System.out.println("Введите количество коров ");
		int cows=in.nextInt();
		System.out.println("Введите количество свиней ");
		int pigs=in.nextInt();
		animals( chik,cows, pigs);
		
		System.out.println("Задача №4");
		System.out.println("Введите первое число ");
		float prob=in.nextFloat();
		System.out.println("Введите второе число ");
		float prize=in.nextFloat();
		System.out.println("Введите третье число ");
		float pay=in.nextFloat();
		System.out.println(profitableGamble( prob, prize,pay));
		
		System.out.println("Задача №5");
		System.out.println("Введите первое число");
		int N=in.nextInt();
		System.out.println("Введите второе число");
		int aa=in.nextInt();
		System.out.println("Введите второе число");
		int bb=in.nextInt();
		operation( N, aa, bb);
		
		System.out.println("Задача №6");
		System.out.println("Введите символ");
		int xx= System.in.read();
		char c=(char) xx;
		System.out.println("Код символа:"+c+"="+xx);
		
		System.out.println("Задача №7");
		System.out.println("Введите число");
		int n=in.nextInt();
		System.out.println("Сумма всех чисел от 1 до введенного числа =");
		System.out.println(addUpto( n));
		
		System.out.println("Задача №8");
		System.out.println("Введите длину одной стороны треугольника");
	    int a1=in.nextInt();
		System.out.println("Введите длину второй стороны треугольника");
		int b1=in.nextInt();
		nextEdge(a1,b1);
		

		System.out.println("Задача №9");
		System.out.println("Введите размер массива");
		int size=in.nextInt();
		int sum=0;
		int sum1=0;
		int array[] =new int [size];
		System.out.println("Введите элементы массива");
		for (int i=0;i<size;i++)
		{ array[i]=in.nextInt();
		}
		
		for ( int num: array )
		{   sum=num*num*num;
			sum1=sum1+sum;
		}
		
		System.out.println("Сумма кубов массива = "+sum1);
		
		
		System.out.println("Задача №10");
		System.out.println("Введите число a");
		double a2=in.nextDouble();
		System.out.println("Введите число b");
		double b2=in.nextDouble();
		System.out.println("Введите число c");
		double c2=in.nextDouble();
		abcmath(a2, b2, c2);
		
		in.close();
	}	
	static	void remainder(int x, int y)
		{ 
		
		int c = x % y;
		System.out.println("Остаток от деления = ");
		System.out.println(c);	
	}
	static	void triArea(int a, int h)
	{   
		int S=(a*h)/2;
		System.out.println("Площадь треугольнка =");
		System.out.println(S);	
	}
	static	void animals(int chik, int cows,int pigs)
	{   
		int sum=2*chik+4*cows+4*pigs;
		System.out.println("Общее количество ног всех животных=");
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
			System.out.println("сложение") ;
			return;}
		if (aa-bb==N)
		{	System.out.println("вычитание");
			return ;}
		if (aa*bb==N)
		{	System.out.println("умножение");
			return ;}
		else if(aa/bb==N)
		{	System.out.println("деление");
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
			System.out.println("Длина третьей стороны треугольника = "+c);
			
			
		}
	 
	 static	void abcmath(double a2,double b2,double c2)
		{   
			for (int i=1;i<=b2;i++)
			{ 
				a2=a2+a2;
			}
			System.out.println("Полученное число = "+a2);
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
