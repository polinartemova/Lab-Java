package lab5;

public class lab5Player extends lab5Person

{
    String name;
    
    public lab5Player(String name)
    {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int a1, lab5Enemy e, lab5Player p)
    {
        if (e.a == a1)//���� ��������� ����� ����� ������� � ������ ��� ������
        {
            p.poterenLives(p);
            
            System.out.println("���� �����! �" + p.name + " �������� " + p.lives + " ������");
        }
        else
            System.out.println("���� �� ������ �����");
    }

}