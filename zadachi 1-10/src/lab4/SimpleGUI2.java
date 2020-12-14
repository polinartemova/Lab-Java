package lab4;
import java.awt.*;
import java.awt.event.*;// ���������� ��������� ����������� ������� �� ������ � ��
import javax.swing.*; // ���������� ��� �����
import javax.swing.border.Border;

public class SimpleGUI2 extends JFrame {
    private JButton button = new JButton("��� ������");
    private JLabel label1 = new JLabel("������� ���:");
    private JTextField input = new JTextField("",5);
    private JCheckBox check = new JCheckBox("��������?",false);//�������� �������� �� ���� �������, false - (�� ����� �������).


    public SimpleGUI2(){
        super("������� ���������");
        this.setSize(300,150);//������� ����
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
//        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 2);//���� ����
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

    class ButtonEventListrner implements ActionListener{//������
        public void actionPerformed (ActionEvent e){
            String message = "";//������� ������
            message+=input.getText()+"\n"; //���������
            message+= ((check.isSelected()) ? "�������� " : "����������");//�������(�����/�� �����)
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }

    }
}

