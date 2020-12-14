package lab4;
import java.awt.*;
import java.awt.event.*;// библиотека позволяет отслеживать нажатия на кнопки и тд
import javax.swing.*; // библиотека для формы
import javax.swing.border.Border;

public class SimpleGUI2 extends JFrame {
    private JButton button = new JButton("Все готово");
    private JLabel label1 = new JLabel("Введите имя:");
    private JTextField input = new JTextField("",5);
    private JCheckBox check = new JCheckBox("Согласны?",false);//создание чекбокса то есть галочки, false - (не стоит галочка).


    public SimpleGUI2(){
        super("Простая программа");
        this.setSize(300,150);//размеры окна
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
//        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 2);//цвет фона
        input.setBorder(solidBorder);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
//        label1.setBackground(Color.BLACK);
//        label1.setOpaque(true);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2,2,2));
        container.add(label1);
        container.add(input);
        button.addActionListener(new ButtonEventListrner());
        container.add(button);
        container.add(check);

    }

    class ButtonEventListrner implements ActionListener{//кнопка
        public void actionPerformed (ActionEvent e){
            String message = "";//создаем строку
            message+=input.getText()+"\n"; //считываем
            message+= ((check.isSelected()) ? "Согласны " : "Несогласны");//чекбокс(нажат/не нажат)
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }

    }
}

