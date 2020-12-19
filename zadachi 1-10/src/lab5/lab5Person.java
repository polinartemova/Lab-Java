package lab5;

public class lab5Person 
{
    public int a;
    public int lives;//переменная жизни
    String name;
    
    public lab5Person(String name)
    {
        this.name = name;
        this.lives = 100;//изначально 100 жизней
    }
    public static void poterenLives(lab5Person p)
    {
        p.lives -= 10;//отнимаем 10 жизней, если враг попал
    }
}
