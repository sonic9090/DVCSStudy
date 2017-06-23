import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseAdapterEx extends JFrame{

	JPanel contentPane = new JPanel(); // ����Ʈ������ ����� �г�
	JLabel la; // "hello" ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
	public MouseAdapterEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane); // ����Ʈ�� ����
		contentPane.setLayout(null); // ����Ʈ���� ��ġ������ ����
		contentPane.addMouseListener(new MyMouseAdapter()); // ����Ʈ�ҿ� Mouse ������ �ޱ�
		
		la = new JLabel("hello"); // "hello" ���̺� ������Ʈ ����
		la.setSize(50,20); // ���̺��� ũ�� 50x20�� ����
		la.setLocation(30, 30); // ���̺��� ��ġ (30,30)���� ���� 
		contentPane.add(la);
		setSize(500, 500);
		setVisible(true);
	}
	
	// MouseAdapter�� ��ӹ޾� �̺�Ʈ ������ ����
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺 Ŭ�� ��ǥ x
			la.setLocation(x, y);
		}

	}
	
	public static void main(String [] args) {
		new MouseAdapterEx();
	}
	
}


