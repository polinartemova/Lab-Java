import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class zadacha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println ("Задача 1");
		System.out.println ("Введите количество строк");
		int n =in.nextInt() ;
		System.out.println ("Введите количество букв в строке");
		int k = in.nextInt();
		in.nextLine();
		System.out.println ("Введите строку");
		String input = in.nextLine();
		System.out.println("Результат: ");
		System.out.println(essay(n, k, input));
		
		
		System.out.println ("Задача 2"); 
		System.out.println ("Введите строку скобок");
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
		
		System.out.println ("Задача 3");
		System.out.println ("Введите строку");
		String input2 = in.nextLine();
		System.out.println("без подчеркивания: " + toCamelCase(input2));
		System.out.println("с подчеркиванием: " + toSnakeCase(input2));
		
		System.out.println ("Задача 4");
		System.out.println("Введите размер  массива");
		int size=in.nextInt();
		double a1[] =new double [size];
		System.out.println("Введите элементы  массива");
		for (int i=0;i<size;i++)
		{ a1[i]=in.nextInt();
		}
		System.out.println("Результат: " + overTime(a1));
		in.nextLine();
		
		System.out.println ("Задача 5");
		System.out.println("Введите вес с единицами измерения");
		String weight =in.nextLine();
		System.out.println("Введите рост с единицами измерения");
		String height = in.nextLine();
		System.out.println("Результат: " + BMI(weight, height));
		
		
		System.out.println ("Задача 6");
		System.out.println ("Введите число");
		int input3 = in.nextInt();
		System.out.println("Результат: " + bugger(input3));
		in.nextLine();
		
		System.out.println ("Задача 7");
		System.out.println ("Введите строку");
		String input4 = in.nextLine();
		System.out.println("Результат: " + toStarShorthand(input4));
		
		System.out.println ("Задача 8");
		System.out.println ("Введите первую строку");
		String a = in.nextLine();
		System.out.println ("Введите  вторую  строку");
		String b = in.nextLine();
		System.out.println("Результат: " + doesRhyme(a, b));
		
		System.out.println ("Задача 9");
		System.out.println ("Введите первое число");
		long a11 = in.nextLong();
		System.out.println ("Введите второе число");
		long b1 = in.nextLong();
		System.out.println("Результат: " + trouble(a11, b1));
		in.nextLine();
		
		
	     System.out.println ("Задача 10");
	     System.out.println ("Введите строку");
	     String str1 = in.nextLine();
	     System.out.println ("Введите символ");
	     String c = in.nextLine();
	     System.out.println("Результат: " + countUniqueBooks(str1, c));
		
		
		
	}
	
	

	
	//1
	public static String essay(int words, int lineWidth, String str)
    {
        String[] lines = str.split(" ");
        String result = "";
        int currentLine = 0;
        for (String line: lines)
        {

            if (line.length() + currentLine <= lineWidth)//если длина строки+длина текущей строки меньше заданного кол-ва букв в строке
            {

                //увеличиваем длину строки
                if (result=="")
                {
                    result += line;
                }
                else
                    {
                    result +=" " + line; //помещаем слово на эту же строку
                    }
                currentLine += line.length(); //увеличиваем длину строки
            }
            else
            {
                result += "\n" + line;// иначе помещаем слово на след строку
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
			if (Character.isUpperCase(str.charAt(i)))// определяет, находится ли указанное значение типа char в верхнем регистре (заглавной буквой).
			{
				end = i;
				if (start == 0)
					res += str.substring(start, end);
				else //добавляем _ и меняем заглавную букву на прописную
					res += "_" + Character.toLowerCase(str.charAt(start)) + str.substring(start + 1, end);// определяет, находится ли указанное значение типа char в нижнем регистре.
				start = end;
			}
		}
		if (start != 0) res += "_"; //если с маленькой буквы, то убираем подчеркивание и меняем прописную букву на загланую
		res += Character.toLowerCase(str.charAt(start)) + str.substring(start + 1);
		return res;
	}
	//4
	public static String overTime(double[] input)
	{
		double start = input[0];//начало дня
		double end = input[1];//конец дня
		double perHour = input[2];//почасовая ставка
		double multiplier = input[3];//множитель сверхурочных работ
		
		double earned = 0;
		if (start < 17 && end <= 17)//с 9 до 17
			earned = (end - start) * perHour;//без сверхурочных
		else if (start >= 17 && end > 17)// с 17 до 18
			earned = (end - start) * perHour * multiplier;// сверхурочно
		else// целый день с 9 до 18
			earned = ((17 - start) + (end - 17) * multiplier) * perHour;
		
		int dollars = (int)earned;//заработанные деньги
		int cents = (int)Math.round((earned % 1) * 100);//округление
		return "$" + dollars + "." + cents + ((cents == 0 ? "0" : ""));
	}
	//5
	public static String BMI(String weight, String height)
	{
		double w = Double.parseDouble(weight.split(" ")[0]);//используется для инициализации STRING (который должен содержать некоторое числовое значение),возвращаемое значение имеет тип примитивных данных, например int, float 
		if (weight.endsWith("pounds"))//перевод в фунты
			w *= 0.45359237;
		double h = Double.parseDouble(height.split(" ")[0]);
		if (height.endsWith("inches"))//превод в дюймы
			h *= 0.0254;
		double index = w / (h*h); //считаем индекс массы тела
		System.out.println(index);
		index = Math.round(index * 10) / 10.0;//округляем до ближайшей десятой
		String category = "";//определяем категорию
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
		while (n > 10)//берем числа больше 10, чтобы можно было умножать
		{
			int temp = n;
			int product = 1;
			while (temp > 0)
			{
				product *= (temp % 10);// умножаем первую цифру  на вторую цифру 
				temp /= 10; //делим n на 10, чтобы получить первую цифру
			}
			n = product;// присваем n значение нового числа, полученного при умножении
			count++; 
		}
		return count;
	}
	//7
	public static String toStarShorthand(String str)
	{
		String res = "";
		char lastChar = ' ';
		int count = 0;//ко-во повторений символа
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == lastChar)
				count++;
			else
			{
				if (lastChar != ' ')
				{
					if (count > 1)// если символ повторяется больше 1 раза, то пишем * и кол-во повторений
						res += lastChar + "*" + count;
					else //просто выводим символ
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
		
		//substring-вырезает из строки с определнного индекса (b.lastIndexOf(" ") + 1) и преобразует это в новую строку.
		//lastIndexOF(" ")-нахождение последнего индекса, в данном случая пробела.
		//toUpperCase()-возводит строку в верхний регистр.
				
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
		String strA = Long.toString(a);//первое число
		String strB = Long.toString(b);//второе число
		int[] repeatsA = new int[10];
		int[] repeatsB = new int[10];
		for (int i = 0; i < strA.length(); i++)
			repeatsA[Integer.parseInt(strA.substring(i, i+1))]++;
		//Integer.parseInt-преобразует строку из чисел!(c другими символами не работает) в число int.
		//substring-вырезает из строки с определнного идекса, можно задать интервал 2 индексами.
		
		for (int i = 0; i < strB.length(); i++)
			repeatsB[Integer.parseInt(strB.substring(i, i+1))]++;
		for (int i = 0; i < 10; i++)
			if (repeatsA[i] == 3 && repeatsB[i] == 2)// если выполняется условие, то возвращаем true
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
        for (int i = 0; i < str.length(); i++)//цикл по всей строчке по элементам
        {
            if (array[i].equals(c))//сравнение элемента строки под индексом i с нашим заданным с.
            {   //когда наша книга начинается

                if (bookOpen)
                    uniqueChars += currentBook;

                bookOpen = !bookOpen;//перезапись bookOpen True
            }
            else
            {   //внутри книги (элементы между 2 элементами "c")
                if (bookOpen)//так как мы уже открыли книгу то у нас сменилось на true и тепрь условие подходит
                    if (!uniqueChars.contains(str.substring(i, i+1)) && !currentBook.contains(str.substring(i, i+1)))//contains - метод, который проверяет находится таже последовательность в страке.
                        //берем нашу строку uniqueChars и с помощью contains проверяет сходится с элементом str (в начале стоит "!" , !(false)-->true )
                        uniqueChars += str.charAt(i);// добавление в строку элемент который содержится между двумя "c"
            }
        }
        return uniqueChars.length();

    }
	
	    }
	

