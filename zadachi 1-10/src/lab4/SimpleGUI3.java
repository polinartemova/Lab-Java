package lab4;
import java.awt.*;
import java.awt.event.*;// ��������� ��������� ����������� ������� �� ������ � ��
import javax.swing.*; // ���������� ��� �����
import javax.swing.border.Border;

public class SimpleGUI3 extends JFrame {
    private JButton button = new JButton("������ ����");
    private JLabel label1 = new JLabel("������� �����:");
    private JTextField input = new JTextField("",5);
    boolean g=true;


    public SimpleGUI3(){
        super("������� ���������");
        this.setSize(400,200);//������ ����
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 2);
        Dimension BSize = new Dimension(100, 200);
        input.setBackground(Color.RED);//������ ���� ��� ����� ������ �������
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2,2,2));
        container.add(label1);
        container.add(input);
        button.addActionListener(new ActionListener() {
        	
        	int a=-1;//������� ������
             public void actionPerformed(ActionEvent e) {
            	 
            	 a++;
            	 if (a%2 ==0)
            	 {
            		 input.setVisible(false);//���� ������ �� �������� ����
            		 button.setText("�������� ����");
            	 }
            	 else
            	 {
            		 
            		 input.setVisible(true);//��������-���� ����������
            		 button.setText("������ ����");
            	 }
                 

             }
        });

                container.add(button);

    }



}