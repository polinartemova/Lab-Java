
import java.util.Scanner;
public class zadacha2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		
		System.out.println("Задача №1");
		System.out.println("Введите слово");
	     String s= in.nextLine();
	     System.out.println("Сколько раз повторить символ?");
		int n = in.nextInt();
		System.out.println("Результат: " + repeat(s, n));
		
		System.out.println("Задача №2");
		System.out.println("Введите размер массива");
		int size=in.nextInt();
		int arr[] =new int [size];
		System.out.println("Введите элементы массива");
		for (int i=0;i<size;i++)
		{ arr[i]=in.nextInt();
		}
		System.out.println("Разница между самым большим и самым маленьким числом : " + differenceMaxMin(arr));
		in.nextLine();
		
	
		System.out.println("Задача №3");
		System.out.println("Введите размер массива");
		int size1=in.nextInt();
		int arr1[] =new int [size];
		System.out.println("Введите элементы массива");
		for (int i=0;i<size;i++)
		{ arr1[i]=in.nextInt();
		}
		System.out.println("Является ли среднее значение элементов массива цилым числом? " + isAvgWhole(arr1));
		
		
		System.out.println("Задача №4");
		
		System.out.println("Введите размер массива");
		int size2=in.nextInt();
		int arr2[] =new int [size];
		System.out.println("Введите элементы массива");
		for (int i=0;i<size;i++)
		{ arr2[i]=in.nextInt();
		}
		System.out.println("Результат:"+ cumulativeSum(arr2));
	/*	printArray (cumulativeSum(arr2));*/
		in.nextLine();
		
		System.out.println("Задача №5");
		System.out.println("Введите десятичное число");
		String input = in.nextLine();
		System.out.println("Число десятичных знаков: " + getDecimalPlaces(input));
		
		System.out.println("Задача №6");
		System.out.println("Введите число");
		int input1 = in.nextInt();
		System.out.println("Число Фибоначчи: " + Fibonacci(input1));
		in.nextLine();
		
		System.out.println("Задача №7");
		System.out.println("Введите почтовый индекс");
		String input2 =in.nextLine() ;
		System.out.println("Почтовый индекс действителен?: " + isValid(input2));
		
		
		System.out.println("Задача №8");
		System.out.println("Введите перву строку");
		String a = in.nextLine();
		System.out.println("Введите вторую строку");
		String b = in.nextLine();
		System.out.println("Пара строк образует странную пару?: " + isStrangePair(a, b));
		
		
		System.out.println("Задача №9");
		System.out.println("Введите слово");
		String a1 = in.nextLine();
		System.out.println("Введите второе слово");
		String b1 = in.nextLine();
		System.out.println("isPrefix: " + isPrefix(a1, b1));
		System.out.println("isSuffix: " + isSuffix(a1, b1));
		
		System.out.println("Задача №10");
		System.out.println("Введите число");
		int n1 = in.nextInt();
		System.out.println("Результат " + boxSeq(n1));
		
	}

	/*1*/
	public static String repeat(String str, int n)
	{
		String res = "";
		for (int i = 0; i < str.length(); i++)
			for (int j = 0; j < n; j++)
				res += str.charAt(i);
		return res;
	}
	
	
	/*2*/
	public static int differenceMaxMin(int[] arr)
	{
		int min = arr[0];
		int max = arr[0];
		for (int element : arr)
		{
			if (element < min)
				min = element;
			if (element > max)
				max = element;
		}
		return max - min;
	}
	
	/*3*/
	
	public static boolean isAvgWhole(int[] arr1)
	{
		double avg = 0;
		for (int e : arr1)
			avg += e;
		avg /= arr1
				.length;
		return avg % 1 == 0;
	}
	
	/*4*/
	public static int[] cumulativeSum(int[] arr2)
	{
		int[] res = new int[arr2.length];
		int accumulated = 0;
		for (int i = 0; i < arr2.length; i++)
		{
			accumulated += arr2[i];
			res[i] = accumulated;
		}
		return res;
	}
	
	/*5*/
	
	public static int getDecimalPlaces(String str)
	{
		int index = str.indexOf(".");
		if (index == -1) return 0;
		return str.length() - index - 1;
	}
	
	/*6*/
	public static int Fibonacci(int n)
	{
		int a = 1;
		int b = 1;
		for (int i = 2; i <= n; i++)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}
	
	
	/*7*/
	public static boolean isValid(String str)
	{
		if (str.length() > 5) return false;
		for (int i = 0; i < str.length(); i++)
			if (!Character.isDigit(str.charAt(i))) return false;
		return true;
	}
	
	
	
	/*8*/
	public static boolean isStrangePair(String a, String b)
	{
		if (a.equals("") && b.equals("")) return true;
		return a.charAt(0) == b.charAt(b.length()-1) && b.charAt(0) == a.charAt(a.length() - 1);
	}
	
	
	/*9*/
	public static boolean isPrefix(String word, String prefix)
	{
		return word.startsWith(prefix.substring(0, prefix.length()-1));
	}
	
	public static boolean isSuffix(String word, String suffix)
	{
		return word.endsWith(suffix.substring(1, suffix.length()));
	}
	
	
	/*10*/
	public static int boxSeq(int n)
	{
		if (n % 2 == 0) return n;
		else return n + 2;
	}
	
}
