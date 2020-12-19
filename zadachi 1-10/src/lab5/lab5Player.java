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
        if (e.a == a1)//если случайное число врага совпало с числом для игрока
        {
            p.poterenLives(p);
            
            System.out.println("Враг попал! У" + p.name + " осталось " + p.lives + " жизней");
        }
        else
            System.out.println("Враг не угадал число");
    }

}