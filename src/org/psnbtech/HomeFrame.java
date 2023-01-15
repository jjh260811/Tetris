package org.psnbtech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class HomeFrame extends JFrame {
    JLabel la =new JLabel();
    public Tetris tetris_;
    public HomeFrame(Tetris tetris){
        tetris_ = tetris;
		// --------------------[프레임 위치 설정하는 코드]----------------------
		// 프레임(자바 화면) 크기
		Dimension frameSize = getSize();
		// 모니터 크기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
		setLocation((screenSize.width - frameSize.width) / 2-150, (screenSize.height - frameSize.height) / 2-250);
        
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton newBtn = new JButton("start");
        newBtn.setBounds(67, 240, 150, 30);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(la);
		c.add(newBtn);
        //la.setHorizontalAlignment(JLabel.CENTER);
		setVisible(true);
        newBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					tetris_ = new Tetris();
                    tetris_.startGame();

			}       
		});
        

    }
}
