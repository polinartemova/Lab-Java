package lab4;
import java.awt.*;
import java.awt.event.*;// библиотека позволяет отслеживать нажатия на кнопки и тд
import javax.swing.*; // библиотека для формы
import javax.swing.border.Border;


public class SimpleGUI1 extends JFrame {
    private JButton button = new JButton("Нажмите");//-создание кнопки
    private JLabel label1 = new JLabel("Привет",JLabel.CENTER);//создание лайбла 1
    private JLabel label2 = new JLabel("Мир",JLabel.CENTER);//создание лайбла 2
    
    public SimpleGUI1(){
        super("Простая программа");// title
        this.setSize(200,200);//размер формы окна
        this.setLocationRelativeTo(null); // метод от которого зависит где появляется окно в данном случае null/ в центре экрана.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// метод позволяет выключить приложение через крестик в углу.
        this.setVisible(true);
        this.setResizable(false);//- метод не позволяет менять размеры формы.
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 1);//-создание рамок (цвет, толщина)
        label1.setBorder(solidBorder);//-применение этого метода к label1
//        
        label2.setBorder(solidBorder);//-применение этого метода к label2
        Container container = this.getContentPane();// - создание конструктора нащей формы, в нем мы добавляем наши лэйблы, кнопки и тд .
        container.setLayout(new GridLayout(3,2,2,2));// - можно сказать что это разметка типо 3-это строчки 2-столбцы а 2,2 это разделение между обьектами
        container.add(label1);//-добавление label1
        container.add(label2);//-добавление label2
        button.addActionListener(new ButtonEventListrner ());//- создаем метод, который реагирует на нажатие кнопки
        container.add(button);//-добавляем нашу кнопку в форму(контейнер)


    }

    class ButtonEventListrner implements ActionListener{ //- метод кнопки
        public void actionPerformed (ActionEvent e){//-функция реагирования на нажатие кнопки, в ней нужно прописывать что будет при нажатии кнопки. Также можно обойтись этими методами и просто сделать как в 3 примере.
        //в даной задачи вроде не нужно вообще прописывать реакцию на кнопку, так что можно удалить все что в функции.
            String message = "";//-создание строки 
            message += label1.getText()+" ";//-записываем текст с label1
            message += label2.getText()+"!";//-записываем текст с label1
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);//-метод который выводит наже сообщение которое получилось в новом окне.

        }

    }

}
/*JLabel - класс для создания объекта с надписью;
//JTextField - класс для создания текстового поля;
//JButton - класс для создания кнопки;
//JCheckBox - класс для создания кнопки-галочки;
//JRadioButton - класс для создания кнопок выбора.*/
