package lab4;
import java.awt.*;
import java.awt.event.*;// библотека позволяет отслеживать нажатия на кнопки и тд
import javax.swing.*; // библиотека для формы
import javax.swing.border.Border;

public class SimpleGUI3 extends JFrame {
    private JButton button = new JButton("Скрыть поле");
    private JLabel label1 = new JLabel("Введите число:");
    private JTextField input = new JTextField("",5);
    boolean g=true;


    public SimpleGUI3(){
        super("Простая программа");
        this.setSize(400,200);//размер окна
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 2);
        Dimension BSize = new Dimension(100, 200);
        input.setBackground(Color.RED);//делаем поля для ввода текста красным
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2,2,2));
        container.add(label1);
        container.add(input);
        button.addActionListener(new ActionListener() {
        	
        	int a=-1;//нажатие кнопки
             public void actionPerformed(ActionEvent e) {
            	 
            	 a++;
            	 if (a%2 ==0)
            	 {
            		 input.setVisible(false);//если четное то скрываем поле
            		 button.setText("Показать поле");
            	 }
            	 else
            	 {
            		 
            		 input.setVisible(true);//нечетное-поле показываем
            		 button.setText("Скрыть поле");
            	 }
                 

             }
        });

                container.add(button);

    }



}