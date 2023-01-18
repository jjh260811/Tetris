package org.psnbtech;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Help extends JFrame{
    private ImageIcon keyboard= new ImageIcon(Help.class.getResource("../keyboard.jpg"));
    public Help() {
        
        
        setSize(getPreferredSize());
        JDialog jd = new JDialog(this);

        jd.setLayout( new BorderLayout());


        jd.setBounds(500, 300, 400, 300);


        Image img = keyboard.getImage();
        Image updateimg = img.getScaledInstance(400, 155, Image.SCALE_SMOOTH);
        ImageIcon updateIcon = new ImageIcon(updateimg);
        JLabel jLabel = new JLabel();
        JLabel explain[] =new JLabel[6];
        JPanel explain_j = new JPanel();
        String msg[] = new String[6];
        msg[0] ="방향키 왼쪽 - 왼쪽 이동";
        msg[1] ="방향키 오른쪽 - 오른쪽 이동";
        msg[2] ="Q - 반시계방향 전환";
        msg[3] ="E - 시계방향 전환";
        msg[4] ="방향키 아래 - 빠르게";
        msg[5] ="ESC - 일시정지";
        for(int i = 0;i<6;i++){
            explain[i] = new JLabel(msg[i]);
            explain_j.add(explain[i],new FlowLayout());
        }

        jLabel.setIcon(updateIcon);
        JPanel j = new JPanel();
        j.setLayout(new FlowLayout(FlowLayout.LEFT));
        j.add(jLabel);
        
        JButton jButton = new JButton("Close");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setVisible(false);
            }
        });
    
        
        jd.add(j,BorderLayout.NORTH);
        jd.add(explain_j,BorderLayout.CENTER);
        jd.add(jButton,BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        jd.setVisible(true);
    }
}
