package labs;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//������ �����
	int i=0;
	while (i<15) {
	        //�������������� � � ����������� ������� �������(Math.random()=0...0.9999), ������� ��������� �� 10, ����� ����������� ��� ��� int ����� ������� ����� �����.
	  int a = (int) (Math.random() * 20);
	          //�������� ��� �����
	   System.out.println("������ ����� "+a);

	         
	          //������� �� ������� 2 ����� ����� AffableThread2 � AffableThread3 � ������������ � ��� extends Thread, ��� �������� 2 � 3 �������.
	  if (a%2==0){
	  new AffableThread2(a).start();//(��������) ������ ������ ������  AffableThread2
	          }
	      else {
	        new AffableThread3(a).start();
	          }
	          i++;

	          //������ ������� ������ 1000 �������. (1�) � ����� ���� �����������.
	      try {
	              Thread.sleep(1000);
	      } catch (InterruptedException e) {
	              e.printStackTrace();
	       }
	          
      System.out.println();
	      }
	}

}

//����� �2
class AffableThread2 extends Thread
{
  private int to; 

  public AffableThread2(int to) { // ��������� ��� ���������� �������� AffableThread2(//___a___//).start(), �� ���� �������� ��� �� ��� ������� �� �������� �, � �� �������������� � � to. 
      this.to = to;// ������������ �������� to
  }

  @Override //��� ����������� ����������� ����� ���, ��� �� �� ���� ���������� ��������� � ������� ������-������, �� ������������ ���� ���������, �� ������� �������� ��� ��� �������������.
  public void run()	//���� ����� ����� �������� � �������� ������
  {
      System.out.println("������ ����� "+to*to);// �������� ������� �������� to (�.�. �).
  }
}

//����� �3 , ���������� ������ AffableThread2
class AffableThread3 extends Thread
{
  private int to;

  public AffableThread3(int to) {
      this.to = to;
  }

  @Override
  public void run()	//���� ����� ����� �������� � �������� ������
  {
      System.out.println("������ �����"+to*to*to);

  }
}


