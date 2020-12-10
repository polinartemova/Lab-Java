package labs;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//первый поток
	int i=0;
	while (i<15) {
	        //инициализируем а и присваиваем функцию рандома(Math.random()=0...0.9999), которая домножена на 10, затем оборачиваем это все int чтобы сделать целое число.
	  int a = (int) (Math.random() * 20);
	          //печатаем это число
	   System.out.println("Первый поток "+a);

	         
	          //зарание мы создали 2 новых класа AffableThread2 и AffableThread3 и унаследовали к ним extends Thread, они являются 2 и 3 потоком.
	  if (a%2==0){
	  new AffableThread2(a).start();//(короткая) запись старта потока  AffableThread2
	          }
	      else {
	        new AffableThread3(a).start();
	          }
	          i++;

	          //таймер который длится 1000 милисек. (1с) и потом цикл повторяется.
	      try {
	              Thread.sleep(1000);
	      } catch (InterruptedException e) {
	              e.printStackTrace();
	       }
	          
      System.out.println();
	      }
	}

}

//поток №2
class AffableThread2 extends Thread
{
  private int to; 

  public AffableThread2(int to) { // позволяет нам пересылать значение AffableThread2(//___a___//).start(), то есть работает так же как функция мы отсылаем а, и он перезаписывает а в to. 
      this.to = to;// перезаписись значения to
  }

  @Override //это возможность реализовать метод так, что бы он имел идентичную сигнатуру с методом класса-предка, но предоставлял иное поведение, не вызывая коллизий при его использовании.
  public void run()	//Этот метод будет выполнен в побочном потоке
  {
      System.out.println("Второй поток "+to*to);// печатает квадрат значения to (т.е. а).
  }
}

//поток №3 , анологично классу AffableThread2
class AffableThread3 extends Thread
{
  private int to;

  public AffableThread3(int to) {
      this.to = to;
  }

  @Override
  public void run()	//Этот метод будет выполнен в побочном потоке
  {
      System.out.println("Третий поток"+to*to*to);

  }
}


