package lab4;

import java.awt.*;
import java.awt.event.*;// библиотека позволяет отслеживать нажатия на кнопки и тд
import javax.swing.*; // библиотека для формы
import javax.swing.border.Border;

public class SimpleGUI4 extends JFrame {
    private JButton button = new JButton("Отобразить");
    private JTextField input = new JTextField("",5);


    public SimpleGUI4(){
        super("Простая программа");
        this.setSize(300,70);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 2);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1,2,5,5));
        container.add(input);
        button.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            	 
                String mesng="";//создаем строку
                if (!input.getText().equals("")){
                    mesng+=input.getText();//считываем с текстового поля
                    JOptionPane.showMessageDialog(null,mesng,"Output",JOptionPane.PLAIN_MESSAGE);
                }

             }
        });


        container.add(button);

    }



}