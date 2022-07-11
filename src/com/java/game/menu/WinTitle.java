package com.java.game.menu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinTitle extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Image winLogo = new ImageIcon("res/tex/logo/winLogo/winLogo.png").getImage();

	JFrame jFrameWinTitle;

	int widthTitle = 125,heightTitle = 0;

	public WinTitle(JFrame jFrameWinTitle){
		this.jFrameWinTitle = jFrameWinTitle;
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paint(Graphics g){
		g.drawImage(winLogo,widthTitle,heightTitle,1000,1000,null);

	}
	
}