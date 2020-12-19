package lab5;
import java.util.*;
import java.io.*;

public class lab51 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Scanner in2 = new Scanner(System.in);
		 
		lab5Player player = new lab5Player("Полина");//имя игрока
        lab5Enemy enemy = new lab5Enemy("Компьютер");//имя врага
       
        int a1;
        while (enemy.lives > 0 && player.lives > 0) {//пока у врага и у игрока есть жизни
            enemy.a = (int) (Math.random() * 10);//рандом чисел для врага
            player.a = (int) (Math.random() * 10);//рандом для игрока

            System.out.print("Введите число от 1 до 10: ");
            a1 = in2.nextInt();
            
            enemy.checkRandom(a1, player, enemy);
            player.checkRandom(player.a, enemy, player);
            
            System.out.println("Случайное число игрока: " + player.a);
            System.out.println("Случайное число врага: " + enemy.a);
        }
        System.out.println("Игра окончена! ");

    
	}

}
