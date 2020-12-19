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
        if (e.a == a1)//введенное число=числу врага
        {
            e.poterenLives(e);//отнимаем жизни у врага
            System.out.println("Вы угадали! Теперь у врага  " + e.name + " осталось " + e.lives + " жизней");
        }
        else if (e.a > a1)//если больше
            System.out.println("Вы не угадали! Число, которое вы пытаетесь угадать больше!");
        else if (e.a < a1)//если меньше
            System.out.println("Вы не угадали! Число, которое вы пытаетесь угадать меньше!");
    }
}
