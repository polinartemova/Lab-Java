package lab4;

import java.awt.*;
import java.awt.event.*;// ���������� ��������� ����������� ������� �� ������ � ��
import javax.swing.*; // ���������� ��� �����
import javax.swing.border.Border;

public class SimpleGUI4 extends JFrame {
    private JButton button = new JButton("����������");
    private JTextField input = new JTextField("",5);


    public SimpleGUI4(){
        super("������� ���������");
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
            	 
                String mesng="";//������� ������
                if (!input.getText().equals("")){
                    mesng+=input.getText();//��������� � ���������� ����
                    JOptionPane.showMessageDialog(null,mesng,"Output",JOptionPane.PLAIN_MESSAGE);
                }

             }
        });


        container.add(button);

    }



}