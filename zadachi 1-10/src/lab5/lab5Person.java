package lab5;

public class lab5Person 
{
    public int a;
    public int lives;//���������� �����
    String name;
    
    public lab5Person(String name)
    {
        this.name = name;
        this.lives = 100;//���������� 100 ������
    }
    public static void poterenLives(lab5Person p)
    {
        p.lives -= 10;//�������� 10 ������, ���� ���� �����
    }
}
