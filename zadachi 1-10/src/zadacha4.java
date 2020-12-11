import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class zadacha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println ("������ 1");
		System.out.println ("������� ���������� �����");
		int n =in.nextInt() ;
		System.out.println ("������� ���������� ���� � ������");
		int k = in.nextInt();
		in.nextLine();
		System.out.println ("������� ������");
		String input = in.nextLine();
		System.out.println("���������: ");
		System.out.println(essay(n, k, input));
		
		
		System.out.println ("������ 2"); 
		System.out.println ("������� ������ ������");
		String input1 = in.nextLine();
		ArrayList<String> newArl = new ArrayList<>();
		String str="";
		int sr=0;
        String[] array =input1.split(input1);
        for(int i=0;i<array.length;i++){
            if (array[i].equals("(")){
                sr++;
                str+=array[i];
            }
            if (array[i].equals(")")){
                sr--;
                str+=array[i];
                if(sr==0){
                    newArl.add(str);
                    str="";
                }
            }
        }
        for(String j:newArl){
            System.out.println(j);
        }
		
		System.out.println ("������ 3");
		System.out.println ("������� ������");
		String input2 = in.nextLine();
		System.out.println("��� �������������: " + toCamelCase(input2));
		System.out.println("� ��������������: " + toSnakeCase(input2));
		
		System.out.println ("������ 4");
		System.out.println("������� ������  �������");
		int size=in.nextInt();
		double a1[] =new double [size];
		System.out.println("������� ��������  �������");
		for (int i=0;i<size;i++)
		{ a1[i]=in.nextInt();
		}
		System.out.println("���������: " + overTime(a1));
		in.nextLine();
		
		System.out.println ("������ 5");
		System.out.println("������� ��� � ��������� ���������");
		String weight =in.nextLine();
		System.out.println("������� ���� � ��������� ���������");
		String height = in.nextLine();
		System.out.println("���������: " + BMI(weight, height));
		
		
		System.out.println ("������ 6");
		System.out.println ("������� �����");
		int input3 = in.nextInt();
		System.out.println("���������: " + bugger(input3));
		in.nextLine();
		
		System.out.println ("������ 7");
		System.out.println ("������� ������");
		String input4 = in.nextLine();
		System.out.println("���������: " + toStarShorthand(input4));
		
		System.out.println ("������ 8");
		System.out.println ("������� ������ ������");
		String a = in.nextLine();
		System.out.println ("�������  ������  ������");
		String b = in.nextLine();
		System.out.println("���������: " + doesRhyme(a, b));
		
		System.out.println ("������ 9");
		System.out.println ("������� ������ �����");
		long a11 = in.nextLong();
		System.out.println ("������� ������ �����");
		long b1 = in.nextLong();
		System.out.println("���������: " + trouble(a11, b1));
		in.nextLine();
		
		
	     System.out.println ("������ 10");
	     System.out.println ("������� ������");
	     String str1 = in.nextLine();
	     System.out.println ("������� ������");
	     String c = in.nextLine();
	     System.out.println("���������: " + countUniqueBooks(str1, c));
		
		
		
	}
	
	

	
	//1
	public static String essay(int words, int lineWidth, String str)
    {
        String[] lines = str.split(" ");
        String result = "";
        int currentLine = 0;
        for (String line: lines)
        {

            if (line.length() + currentLine <= lineWidth)//���� ����� ������+����� ������� ������ ������ ��������� ���-�� ���� � ������
            {

                //����������� ����� ������
                if (result=="")
                {
                    result += line;
                }
                else
                    {
                    result +=" " + line; //�������� ����� �� ��� �� ������
                    }
                currentLine += line.length(); //����������� ����� ������
            }
            else
            {
                result += "\n" + line;// ����� �������� ����� �� ���� ������
                currentLine = line.length();
            }
        }
        return result;
    }

	
	//3
	public static String toCamelCase(String str)
	{
		String[] words = str.split("_");
		String res = words[0];
		for (int i = 1; i < words.length; i++)
		{
			res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
		}
		return res;
	}
	
	public static String toSnakeCase(String str)
	{
		String res = "";
		int start = 0;
		int end = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (Character.isUpperCase(str.charAt(i)))// ����������, ��������� �� ��������� �������� ���� char � ������� �������� (��������� ������).
			{
				end = i;
				if (start == 0)
					res += str.substring(start, end);
				else //��������� _ � ������ ��������� ����� �� ���������
					res += "_" + Character.toLowerCase(str.charAt(start)) + str.substring(start + 1, end);// ����������, ��������� �� ��������� �������� ���� char � ������ ��������.
				start = end;
			}
		}
		if (start != 0) res += "_"; //���� � ��������� �����, �� ������� ������������� � ������ ��������� ����� �� ��������
		res += Character.toLowerCase(str.charAt(start)) + str.substring(start + 1);
		return res;
	}
	//4
	public static String overTime(double[] input)
	{
		double start = input[0];//������ ���
		double end = input[1];//����� ���
		double perHour = input[2];//��������� ������
		double multiplier = input[3];//��������� ������������ �����
		
		double earned = 0;
		if (start < 17 && end <= 17)//� 9 �� 17
			earned = (end - start) * perHour;//��� ������������
		else if (start >= 17 && end > 17)// � 17 �� 18
			earned = (end - start) * perHour * multiplier;// �����������
		else// ����� ���� � 9 �� 18
			earned = ((17 - start) + (end - 17) * multiplier) * perHour;
		
		int dollars = (int)earned;//������������ ������
		int cents = (int)Math.round((earned % 1) * 100);//����������
		return "$" + dollars + "." + cents + ((cents == 0 ? "0" : ""));
	}
	//5
	public static String BMI(String weight, String height)
	{
		double w = Double.parseDouble(weight.split(" ")[0]);//������������ ��� ������������� STRING (������� ������ ��������� ��������� �������� ��������),������������ �������� ����� ��� ����������� ������, �������� int, float 
		if (weight.endsWith("pounds"))//������� � �����
			w *= 0.45359237;
		double h = Double.parseDouble(height.split(" ")[0]);
		if (height.endsWith("inches"))//������ � �����
			h *= 0.0254;
		double index = w / (h*h); //������� ������ ����� ����
		System.out.println(index);
		index = Math.round(index * 10) / 10.0;//��������� �� ��������� �������
		String category = "";//���������� ���������
		if (index < 18.5)
			category = "Underweight";
		else if (index < 25)
			category = "Normal weight";
		else category = "Overweight";
		return index + " " + category;
			
	}
	//6
	public static int bugger(int n)
	{
		int count = 0;
		while (n > 10)//����� ����� ������ 10, ����� ����� ���� ��������
		{
			int temp = n;
			int product = 1;
			while (temp > 0)
			{
				product *= (temp % 10);// �������� ������ �����  �� ������ ����� 
				temp /= 10; //����� n �� 10, ����� �������� ������ �����
			}
			n = product;// �������� n �������� ������ �����, ����������� ��� ���������
			count++; 
		}
		return count;
	}
	//7
	public static String toStarShorthand(String str)
	{
		String res = "";
		char lastChar = ' ';
		int count = 0;//��-�� ���������� �������
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == lastChar)
				count++;
			else
			{
				if (lastChar != ' ')
				{
					if (count > 1)// ���� ������ ����������� ������ 1 ����, �� ����� * � ���-�� ����������
						res += lastChar + "*" + count;
					else //������ ������� ������
						res += lastChar;
				}
				lastChar = str.charAt(i);
				count = 1;
			}
		}
		if (count > 1)
			res += lastChar + "*" + count;
		else
			res += lastChar;
		return res;
	}
	//8
	public static boolean doesRhyme(String a, String b)
	{
		String lastA = a.substring(a.lastIndexOf(" ") + 1).toUpperCase();
		String lastB = b.substring(b.lastIndexOf(" ") + 1).toUpperCase();
		
		//substring-�������� �� ������ � ������������ ������� (b.lastIndexOf(" ") + 1) � ����������� ��� � ����� ������.
		//lastIndexOF(" ")-���������� ���������� �������, � ������ ������ �������.
		//toUpperCase()-�������� ������ � ������� �������.
				
		String vowelsA = "";
		String vowelsB = "";
		for (int i = 0; i < lastA.length(); i++)
			if ("AEIOUY".contains(lastA.substring(i, i+1)))
				vowelsA += lastA.charAt(i);
		for (int i = 0; i < lastB.length(); i++)
			if ("AEIOUY".contains(lastB.substring(i, i+1)))
				vowelsB += lastB.charAt(i);
		return vowelsA.equals(vowelsB);
				
	}
	//9
	public static boolean trouble(long a, long b)
	{
		String strA = Long.toString(a);//������ �����
		String strB = Long.toString(b);//������ �����
		int[] repeatsA = new int[10];
		int[] repeatsB = new int[10];
		for (int i = 0; i < strA.length(); i++)
			repeatsA[Integer.parseInt(strA.substring(i, i+1))]++;
		//Integer.parseInt-����������� ������ �� �����!(c ������� ��������� �� ��������) � ����� int.
		//substring-�������� �� ������ � ������������ ������, ����� ������ �������� 2 ���������.
		
		for (int i = 0; i < strB.length(); i++)
			repeatsB[Integer.parseInt(strB.substring(i, i+1))]++;
		for (int i = 0; i < 10; i++)
			if (repeatsA[i] == 3 && repeatsB[i] == 2)// ���� ����������� �������, �� ���������� true
				return true;
		return false;
		
	}
	//10
	
	public static int countUniqueBooks(String str, String c)
    {
        String[] array =str.split("");
        boolean bookOpen = false;
        String uniqueChars = "";
        String currentBook = "";
        for (int i = 0; i < str.length(); i++)//���� �� ���� ������� �� ���������
        {
            if (array[i].equals(c))//��������� �������� ������ ��� �������� i � ����� �������� �.
            {   //����� ���� ����� ����������

                if (bookOpen)
                    uniqueChars += currentBook;

                bookOpen = !bookOpen;//���������� bookOpen True
            }
            else
            {   //������ ����� (�������� ����� 2 ���������� "c")
                if (bookOpen)//��� ��� �� ��� ������� ����� �� � ��� ��������� �� true � ����� ������� ��������
                    if (!uniqueChars.contains(str.substring(i, i+1)) && !currentBook.contains(str.substring(i, i+1)))//contains - �����, ������� ��������� ��������� ���� ������������������ � ������.
                        //����� ���� ������ uniqueChars � � ������� contains ��������� �������� � ��������� str (� ������ ����� "!" , !(false)-->true )
                        uniqueChars += str.charAt(i);// ���������� � ������ ������� ������� ���������� ����� ����� "c"
            }
        }
        return uniqueChars.length();

    }
	
	    }
	

