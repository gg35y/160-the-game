package com.java.game.art;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.java.game.level.LevelOne;
import com.java.game.sound.Sound;

public class Art extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Image titleNameGame = new ImageIcon("res/tex/logo/logoNameGame.png").getImage(); 
	private Image titleWaterMark = new ImageIcon("res/tex/logo/watermark.png").getImage(); 
	private static final int WIDTH = 180;
	private static final int HEIGHT = 160;
	private static final int SCALE = 5;
	private static final String NAME = "160";
	private static final String LEVELNAME = " Level-1";
	
	public static Sound buttonStartSound;

	JFrame jFrame, jFrameLevelOne;
	JButton jButtonPlay;
	int widthTitle = 125,heightTitle = 0;
	
	public Art(JFrame jFrame){
		this.jFrame = jFrame;
		
		buttonStartSound = new Sound("res/sound/buttonStartSound.wav",0.68);

		jButtonPlay = new JButton("Играть");
		jFrame.add(jButtonPlay);
		jButtonPlay.setBounds((widthTitle+30)*2,heightTitle + 450,250,60);
		jButtonPlay.setBackground(Color.black);
		jButtonPlay.setForeground(Color.white);
		jButtonPlay.setBorder(new LineBorder(Color.white));
		jButtonPlay.addActionListener(this);
		
		jFrameLevelOne = new JFrame(NAME + LEVELNAME); 
		jFrameLevelOne.setSize(WIDTH*SCALE,HEIGHT*SCALE);
		jFrameLevelOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrameLevelOne.setLocationRelativeTo(null);
		jFrameLevelOne.setResizable(false);
		jFrameLevelOne.add(new LevelOne(jFrameLevelOne));
		jFrameLevelOne.setBackground(Color.black);
		jFrameLevelOne.setVisible(false);
	}
	
	public void paint(Graphics g){
		g.drawImage(titleNameGame,widthTitle,heightTitle,1000,1000,null);
		g.drawImage(titleWaterMark,widthTitle-125,heightTitle+700,700,700,null);	
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		
		if(e.getSource() == jButtonPlay){
			buttonStartSound.audio();
			buttonStartSound.setVolume();
			jFrame.setVisible(false);
			jFrameLevelOne.setVisible(true);

		}
	}		
}