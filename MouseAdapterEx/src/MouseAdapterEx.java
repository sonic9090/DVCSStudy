import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseAdapterEx extends JFrame{

	JPanel contentPane = new JPanel(); // 컨텐트팬으로 사용한 패널
	JLabel la; // "hello" 문자열을 출력하기 위한 레이블 컴포넌트
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane); // 컨텐트팬 변경
		contentPane.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		contentPane.addMouseListener(new MyMouseAdapter()); // 컨텐트팬에 Mouse 리스너 달기
		
		la = new JLabel("hello"); // "hello" 레이블 컴포넌트 생성
		la.setSize(50,20); // 레이블의 크기 50x20을 설정
		la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정 
		contentPane.add(la);
		setSize(500, 500);
		setVisible(true);
	}
	
	// MouseAdapter를 상속받아 이벤트 리스너 구현
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 x
			la.setLocation(x, y);
		}

	}
	
	public static void main(String [] args) {
		new MouseAdapterEx();
	}
	
}


