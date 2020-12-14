package lab4;
import java.awt.*;
import java.awt.event.*;// ���������� ��������� ����������� ������� �� ������ � ��
import javax.swing.*; // ���������� ��� �����
import javax.swing.border.Border;


public class SimpleGUI1 extends JFrame {
    private JButton button = new JButton("�������");//-�������� ������
    private JLabel label1 = new JLabel("������",JLabel.CENTER);//�������� ������ 1
    private JLabel label2 = new JLabel("���",JLabel.CENTER);//�������� ������ 2
    
    public SimpleGUI1(){
        super("������� ���������");// title
        this.setSize(200,200);//������ ����� ����
        this.setLocationRelativeTo(null); // ����� �� �������� ������� ��� ���������� ���� � ������ ������ null/ � ������ ������.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ����� ��������� ��������� ���������� ����� ������� � ����.
        this.setVisible(true);
        this.setResizable(false);//- ����� �� ��������� ������ ������� �����.
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 1);//-�������� ����� (����, �������)
        label1.setBorder(solidBorder);//-���������� ����� ������ � label1
//        
        label2.setBorder(solidBorder);//-���������� ����� ������ � label2
        Container container = this.getContentPane();// - �������� ������������ ����� �����, � ��� �� ��������� ���� ������, ������ � �� .
        container.setLayout(new GridLayout(3,2,2,2));// - ����� ������� ��� ��� �������� ���� 3-��� ������� 2-������� � 2,2 ��� ���������� ����� ���������
        container.add(label1);//-���������� label1
        container.add(label2);//-���������� label2
        button.addActionListener(new ButtonEventListrner ());//- ������� �����, ������� ��������� �� ������� ������
        container.add(button);//-��������� ���� ������ � �����(���������)


    }

    class ButtonEventListrner implements ActionListener{ //- ����� ������
        public void actionPerformed (ActionEvent e){//-������� ������������ �� ������� ������, � ��� ����� ����������� ��� ����� ��� ������� ������. ����� ����� �������� ����� �������� � ������ ������� ��� � 3 �������.
        //� ����� ������ ����� �� ����� ������ ����������� ������� �� ������, ��� ��� ����� ������� ��� ��� � �������.
            String message = "";//-�������� ������ 
            message += label1.getText()+" ";//-���������� ����� � label1
            message += label2.getText()+"!";//-���������� ����� � label1
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);//-����� ������� ������� ���� ��������� ������� ���������� � ����� ����.

        }

    }

}
/*JLabel - ����� ��� �������� ������� � ��������;
//JTextField - ����� ��� �������� ���������� ����;
//JButton - ����� ��� �������� ������;
//JCheckBox - ����� ��� �������� ������-�������;
//JRadioButton - ����� ��� �������� ������ ������.*/
