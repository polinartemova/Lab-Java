import java.util.Scanner;
public class zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in2 =new Scanner (System.in);
		
		
		System.out.println ("Задача 1");
		System.out.println ("Введите а");
		double a = in2.nextDouble();
		System.out.println ("Введите b");
		double b = in2.nextDouble();
		System.out.println ("Введите с");
		double c = in2.nextDouble();
		System.out.println("Число решений в уравнении: " + solutions(a,b,c));
		in2.nextLine();
		
		System.out.println ("Задача 2");
		System.out.println ("Введите строку");
		String input = in2.nextLine();
		System.out.println("Позиция второго вхождения zip: " + findZip(input));
		
		
		System.out.println ("Задача 3");
		System.out.println ("Введите  число");
		int input1 = in2.nextInt();
		System.out.println("Число является совершенным? " + checkPerfect(input1));
		in2.nextLine();

		System.out.println ("Задача 4");
		System.out.println ("Введите строку");
		String input3 = in2.nextLine();
		System.out.println("Результат: " + flipEndChars(input3));
		
		System.out.println ("Задача 5");
		System.out.println ("Введите строку");
		String input4 =  in2.nextLine();
		System.out.println("Строка является допустимым шестнадцатеричным кодом? " + isValidHexCode(input));
		

		System.out.println ("Задача 6");
		System.out.println("Введите размер первого массива");
		int size=in2.nextInt();
		int a1[] =new int [size];
		System.out.println("Введите элементы первого массива");
		for (int i=0;i<size;i++)
		{ a1[i]=in2.nextInt();
		}
		System.out.println("Введите размер второго массива");
		int size1=in2.nextInt();
		int b1[] =new int [size1];
		System.out.println("Введите элементы второго массива");
		for (int i1=0;i1<size1;i1++)
		{ b1[i1]=in2.nextInt();
		}
		
		System.out.println("Массивы имеют одинаковое количество уникальных элементов? " + same(a1,b1));
		
		System.out.println ("Задача 7");
		System.out.println ("Введите  число");
		int input5 = in2.nextInt();
		System.out.println("Введенное число является числом Капрекара? " + isKaprekar(input5));
		in2.nextLine();
		
		System.out.println ("Задача 8");
		System.out.println ("Введите последовательность 0 и 1");
		String input6 = in2.nextLine();
		System.out.println("Саая длинная последовательность 0 в строке: " + longestZero(input6));
		
		
		System.out.println ("Задача 9");
		System.out.println ("Введите число");
		int input7 = in2.nextInt();
		System.out.println("Следующее простое число: " + nextPrime(input7));
		
		System.out.println ("Задача 10");
		System.out.println ("Введите первое число");
		double x = in2.nextDouble();
		System.out.println ("Введите второе число");
		double y =in2.nextDouble();
		System.out.println ("Введите третье число");
		double z = in2.nextDouble();
		System.out.println("Числа являются ребрами треугольника? " + rightTriangle(x, y, z));
	}

	//1
	public static int solutions(double a, double b, double c)
	{
		double D = b * b - 4 * a * c;
		if (D < 0) return 0;
		else if (D == 0) return 1;
		else return 2;
	}
	//2
	public static int findZip(String str)
	{
		int index = str.indexOf("zip");
		if (index == -1 || index == str.length() - 1) return -1;
		return str.indexOf("zip", index + 1);
	}
	//3
	public static boolean checkPerfect(int n)
	{
		int sum = 0;
		for (int i = 1; i < n; i++)
		{
			if (n % i == 0) sum += i;
		}
		return n == sum;
	}
	//4
	public static String flipEndChars(String str)
	{
		if (str.length() < 2) return "несовместимо";
		if (str.charAt(0) == str.charAt(str.length() - 1)) return "два-это пара";
		return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
	}
	//5
	public static boolean isValidHexCode(String str)
	{
		if (str.length() != 7 || str.charAt(0) != '#') return false;
		for (int i = 1; i < str.length(); i++)
		{
			if (!( Character.isDigit(str.charAt(i)) 
					|| "ABCDEFabcdef".contains(Character.toString((str.charAt(i))))))
				return false;
		}
		return true;
	}
	//6
	public static int uniquesInArray(int[] arr)
	{
		int uniques = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			boolean unique = true;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j]) unique = false;
			}
			if (unique) uniques++;
		}
		return uniques;
	}
	public static boolean same(int[] a, int[] b)
	{
		return uniquesInArray(a) == uniquesInArray(b);
	}
	
	//7
	public static boolean isKaprekar(int n)
	{
		String square = Integer.toString(n * n);
		String first = ""; String last = "";
		first = square.substring(0, square.length() / 2);
		last = square.substring(square.length() / 2, square.length());
		int a = first.equals("") ? 0 : Integer.parseInt(first);
		int b = last.equals("") ? 0 : Integer.parseInt(last);
		return a + b == n;
	}
	//8
	public static String longestZero(String str)
	{
		int longest = 0;
		int current = 0;
		boolean zeroes = false;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == '0')
			{
				current++;
				zeroes = true;
			}
			else if (zeroes)
			{
				if (current > longest) longest = current;
				zeroes = false;
				current = 0;
			}
		}
		String res = "";
		for (int i = 0; i < longest; i++)
			res += "0";
		return res;
	}
	//9
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < Math.sqrt(n) + 1; i++)
		{
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static int nextPrime(int n)
	{
		if (isPrime(n)) return n;
		while (true)
		{
			n++;
			if (isPrime(n)) return n;
		}
	}
	//10
	public static boolean rightTriangle(double a, double b, double c)
	{
		return (a*a + b*b == c*c)|| (a*a + c*c == b*b)|| (b*b + c*c == a*a);
	}

}
