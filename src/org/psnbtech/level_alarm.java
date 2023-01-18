package org.psnbtech;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;

public class level_alarm extends JPanel{
    private Tetris tetris;
    private String msg;
    private static final Font LFont = new Font("함초롱돋움",Font.PLAIN, 15);
    public level_alarm(Tetris tetris){
       this.tetris = tetris;
        
        
       setPreferredSize(new Dimension(450, 30));
        setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        msg = tetris.getLevel()+"단계입니다!";
        if(tetris.isNewGame()){
            msg = "아직 시작을 안했어요! 시작해주세요!";
        }
        
        if(tetris.getLevel()>=5&&tetris.getLevel()<10){
            msg = "오 " + msg;
 
        }
        if(tetris.getLevel()>=10){
            msg ="!경축! "+msg;
        }
        if(tetris.isGameOver()){
            msg = "너무 아쉬워요..ㅠㅠㅠ";
        }
        g.setFont(LFont);
        g.drawString(msg,225-g.getFontMetrics().stringWidth(msg) / 2,15);

    }
    
}
