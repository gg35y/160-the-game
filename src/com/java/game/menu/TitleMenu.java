package com.java.game.menu;

import java.awt.Color;
import javax.swing.JFrame;

import com.java.game.art.Art;

public class TitleMenu{
	private static final int WIDTH = 180;
	private static final int HEIGHT = 160;
	private static final int SCALE = 5;
	
	private static final String NAME = "160";

	public static void main(String [] arr){
		JFrame jFrame = new JFrame(NAME);
		jFrame.setSize(WIDTH*SCALE,HEIGHT*SCALE);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		jFrame.setResizable(false);
		jFrame.add(new Art(jFrame));
		jFrame.setBackground(Color.black);
		jFrame.setVisible(true);
	} 	
}