package lab5;

public class lab5Enemy extends lab5Person {

	String name;
	
    public lab5Enemy(String name)
    {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int a1, lab5Player p, lab5Enemy e)
    {
        if (e.a == a1)//��������� �����=����� �����
        {
            e.poterenLives(e);//�������� ����� � �����
            System.out.println("�� �������! ������ � �����  " + e.name + " �������� " + e.lives + " ������");
        }
        else if (e.a > a1)//���� ������
            System.out.println("�� �� �������! �����, ������� �� ��������� ������� ������!");
        else if (e.a < a1)//���� ������
            System.out.println("�� �� �������! �����, ������� �� ��������� ������� ������!");
    }
}
