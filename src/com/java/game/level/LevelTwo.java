package com.java.game.level;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.java.game.sound.Sound;

public class LevelTwo extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Image logoLevelTwo = new ImageIcon("res/tex/logo/levelLogo/levelLogoTwo.png").getImage();
	private Image backgroundLevelTwo = new ImageIcon("res/tex/back/backgroundLevelTwo.png").getImage();
	private Image block1Level = new ImageIcon("res/tex/block/block1.png").getImage();
	private Image block2Level= new ImageIcon("res/tex/block/block2.png").getImage();
	private Image block3Level = new ImageIcon("res/tex/block/block3.png").getImage();
	private Image block4Level= new ImageIcon("res/tex/block/block4.png").getImage();
	private Image flagLevelTwo = new ImageIcon("res/tex/flags/germany.png").getImage();
	private static final String NAMEHELPDIALOG = "Помощь";
	private static final int WIDTH = 180;
	private static final int HEIGHT = 160;
	private static final int SCALE = 5;
	private static final String NAME = "160";
	private static final String LEVELNAMETWO = " Level-3";
 	
	public static Sound buttonAnswerSoundTrue;
	public static Sound buttonAnswerSoundFalse;
	public static Sound buttonHelpSound;
	public static Sound buttonLevelSound;
	public static Sound buttonImageSound;

	JFrame jFrameLevelTwo,jFrameLevelTree;
	JLabel jLabelQ1,jLabelQ2,jLabelQ3,jLabelQ4,jLabelQ5,jLabelQ6,jLabelQ7,jLabelQ8,jLabelQ9,jLabelQ10,jLabelHelpDialog;
	JButton jButton1,jButton2,jButton3,jButton4,jButton5,helpButton,jButtonImage1,jButtonImage2,jButtonImage3,jButtonImage4; 
	JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5;
	
	int widthTitle = 170,heightTitle = 0, w = 100, h = 100; 
	int answer1 = 357168, tAnswer1, answer2 = 81, tAnswer2, answer3 = 16, tAnswer3, answer4 = 3, tAnswer4, answer5 = 1945, tAnswer5;
	String t = "Верно!", f = "Неверно!";
	boolean b1 = true, b2 = true,b3 = true, b4 = true;
	
	public void actionPerformed(ActionEvent e) {
		repaint();
		
		if(e.getSource() == jButtonImage1){
			b1=false;
			buttonImageSound.audio();
			buttonImageSound.setVolume();
		}
		
		if(e.getSource() == jButtonImage2){
			b2=false;
			buttonImageSound.audio();
			buttonImageSound.setVolume();
		}
		
		if(e.getSource() == jButtonImage3){
			b3=false;
			buttonImageSound.audio();
			buttonImageSound.setVolume();
		}
		
		if(e.getSource() == jButtonImage4){
			b4=false;
			buttonImageSound.audio();
			buttonImageSound.setVolume();
		}
	}		
		
	public LevelTwo(JFrame jFrameLevelTwo){
		this.jFrameLevelTwo = jFrameLevelTwo;
		
		buttonAnswerSoundTrue = new Sound("res/sound/buttonAnswerSoundTrue.wav",0.68);
		buttonAnswerSoundFalse = new Sound("res/sound/buttonAnswerSoundFalse.wav",0.68);
		buttonHelpSound = new Sound("res/sound/buttonHelpSound.wav",0.68);
		buttonLevelSound = new Sound("res/sound/buttonLevelSound.wav",0.68);
		buttonImageSound = new Sound("res/sound/buttonImageSound.wav",0.68);

		jFrameLevelTree = new JFrame(NAME + LEVELNAMETWO); 
		jFrameLevelTree.setSize(WIDTH*SCALE,HEIGHT*SCALE);
		jFrameLevelTree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrameLevelTree.setLocationRelativeTo(null);
		jFrameLevelTree.setResizable(false);
		jFrameLevelTree.add(new LevelTree(jFrameLevelTree));
		jFrameLevelTree.setBackground(Color.black);
		jFrameLevelTree.setVisible(false);
		
		
		JDialog helpFrame = new JDialog(jFrameLevelTwo, NAMEHELPDIALOG);
		helpFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		helpFrame.setLocationRelativeTo(null);
		helpFrame.setSize(w*2,h*2);
		helpFrame.getContentPane().setBackground(Color.black);;	
		helpFrame.setResizable(false);
		helpFrame.setVisible(false);
		
		jLabelHelpDialog = new JLabel("*1)357168 2)81 3)16 4)3 5)1945*");
		helpFrame.add(jLabelHelpDialog);
		jLabelHelpDialog.setBounds(w,h,250,50);
		jLabelHelpDialog.setForeground(Color.white);
		
        jLabelQ1 = new JLabel("1)Какую площадь в квадратных км");
		jLabelQ2 = new JLabel("занимает территория Германии?");
		jTextField1 = new JTextField();
		jButton1 = new JButton("Ответ");
		jFrameLevelTwo.add(jLabelQ1);
		jFrameLevelTwo.add(jLabelQ2);
		jFrameLevelTwo.add(jTextField1);
		jFrameLevelTwo.add(jButton1);
		jLabelQ1.setBounds((widthTitle+35)*3,heightTitle+50,250,50);
		jLabelQ1.setForeground(Color.white);
		jLabelQ2.setBounds((widthTitle+35)*3,heightTitle+65,250,50);
		jLabelQ2.setForeground(Color.white);
		jTextField1.setBounds((widthTitle+35)*3,heightTitle+100,230,20);
		jTextField1.setForeground(Color.white);
		jTextField1.setBackground(Color.black);
		jTextField1.setForeground(Color.white);
		jTextField1.setBorder(new LineBorder(Color.white));
		jButton1.setBounds((widthTitle+35)*3,heightTitle+130,230,20);
		jButton1.setForeground(Color.white);
		jButton1.setBackground(Color.black);
		jButton1.setForeground(Color.white);
		jButton1.setBorder(new LineBorder(Color.white));
		jButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tAnswer1 = Integer.parseInt(jTextField1.getText());
				if(e.getSource() == jButton1 & tAnswer1 == answer1) {
					buttonAnswerSoundTrue.audio();
					buttonAnswerSoundTrue.setVolume();
					jTextField1.setText(t);
				}else{
					buttonAnswerSoundFalse.audio();
					buttonAnswerSoundFalse.setVolume();
					jTextField1.setText(f);
				}
			}
			
		});
		
		jLabelQ3 = new JLabel("2)Какое количество населения");
		jLabelQ4 = new JLabel("проживает в Германии? (В миллионах)");
		jTextField2 = new JTextField();
		jButton2 = new JButton("Ответ");
		jFrameLevelTwo.add(jLabelQ3);
		jFrameLevelTwo.add(jLabelQ4);
		jFrameLevelTwo.add(jTextField2);
		jFrameLevelTwo.add(jButton2);
		jLabelQ3.setBounds((widthTitle+35)*3,heightTitle+150,250,50);
		jLabelQ3.setForeground(Color.white);
		jLabelQ4.setBounds((widthTitle+35)*3,heightTitle+165,250,50);
		jLabelQ4.setForeground(Color.white);
		jTextField2.setBounds((widthTitle+35)*3,heightTitle+200,230,20);
		jTextField2.setForeground(Color.white);
		jTextField2.setBackground(Color.black);
		jTextField2.setForeground(Color.white);
		jTextField2.setBorder(new LineBorder(Color.white));
		jButton2.setBounds((widthTitle+35)*3,heightTitle+230,230,20);
		jButton2.setForeground(Color.white);
		jButton2.setBackground(Color.black);
		jButton2.setForeground(Color.white);
		jButton2.setBorder(new LineBorder(Color.white));
		jButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tAnswer2 = Integer.parseInt(jTextField2.getText());
				if(e.getSource() == jButton2 & tAnswer2 == answer2){
					buttonAnswerSoundTrue.audio();
					buttonAnswerSoundTrue.setVolume();
					jTextField2.setText(t);
				}else{
					buttonAnswerSoundFalse.audio();
					buttonAnswerSoundFalse.setVolume();
					jTextField2.setText(f);
				}				
			}
		});
		
		jLabelQ5 = new JLabel("3)Сколько Федеральных Земель входят");
		jLabelQ6 = new JLabel("в состав Германии?");
		jTextField3 = new JTextField();
		jButton3 = new JButton("Ответ");
		jFrameLevelTwo.add(jLabelQ5);
		jFrameLevelTwo.add(jLabelQ6);
		jFrameLevelTwo.add(jTextField3);
		jFrameLevelTwo.add(jButton3);
		jLabelQ5.setBounds((widthTitle+35)*3,heightTitle+250,250,50);
		jLabelQ5.setForeground(Color.white);
		jLabelQ6.setBounds((widthTitle+36)*3,heightTitle+265,250,50);
		jLabelQ6.setForeground(Color.white);
		jTextField3.setBounds((widthTitle+35)*3,heightTitle+300,230,20);
		jTextField3.setForeground(Color.white);
		jTextField3.setBackground(Color.black);
		jTextField3.setForeground(Color.white);
		jTextField3.setBorder(new LineBorder(Color.white));
		jButton3.setBounds((widthTitle+35)*3,heightTitle+330,230,20);
		jButton3.setForeground(Color.white);
		jButton3.setBackground(Color.black);
		jButton3.setForeground(Color.white);
		jButton3.setBorder(new LineBorder(Color.white));
		jButton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tAnswer3 = Integer.parseInt(jTextField3.getText());
				if(e.getSource() == jButton3 & tAnswer3 == answer3){
					buttonAnswerSoundTrue.audio();
					buttonAnswerSoundTrue.setVolume();
					jTextField3.setText(t);
				}else{
					buttonAnswerSoundFalse.audio();
					buttonAnswerSoundFalse.setVolume();
					jTextField3.setText(f);
				}
			}
		});

		jLabelQ7 = new JLabel("4)Количество населения в столице");
		jLabelQ8 = new JLabel("Германии ,в городе Берлине");
		jTextField4 = new JTextField();
		jButton4 = new JButton("Ответ");
		jFrameLevelTwo.add(jLabelQ7);
		jFrameLevelTwo.add(jLabelQ8);
		jFrameLevelTwo.add(jTextField4);
		jFrameLevelTwo.add(jButton4);
		jLabelQ7.setBounds((widthTitle+35)*3,heightTitle+350,250,50);
		jLabelQ7.setForeground(Color.white);
		jLabelQ8.setBounds((widthTitle+36)*3,heightTitle+365,250,50);
		jLabelQ8.setForeground(Color.white);
		jTextField4.setBounds((widthTitle+35)*3,heightTitle+400,230,20);
		jTextField4.setForeground(Color.white);
		jTextField4.setBackground(Color.black);
		jTextField4.setForeground(Color.white);
		jTextField4.setBorder(new LineBorder(Color.white));
		jButton4.setBounds((widthTitle+35)*3,heightTitle+430,230,20);
		jButton4.setForeground(Color.white);
		jButton4.setBackground(Color.black);
		jButton4.setForeground(Color.white);
		jButton4.setBorder(new LineBorder(Color.white));
		jButton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tAnswer4 = Integer.parseInt(jTextField4.getText());
				if(e.getSource() == jButton4 & tAnswer4 == answer4){
					buttonAnswerSoundTrue.audio();
					buttonAnswerSoundTrue.setVolume();
					jTextField4.setText(t);
				}else{
					buttonAnswerSoundFalse.audio();
					buttonAnswerSoundFalse.setVolume();
					jTextField4.setText(f);
				}
			}
		});
		
		jLabelQ9 = new JLabel("5)Когда Германия капитулировала?");
		jLabelQ10 = new JLabel("(Напишите только год цифрой)");
		jTextField5 = new JTextField();
		jButton5 = new JButton("Ответ");
		jFrameLevelTwo.add(jLabelQ9);
		jFrameLevelTwo.add(jLabelQ10);
		jFrameLevelTwo.add(jTextField5);
		jFrameLevelTwo.add(jButton5);
		jLabelQ9.setBounds((widthTitle+35)*3,heightTitle+450,250,50);
		jLabelQ9.setForeground(Color.white);
		jLabelQ10.setBounds((widthTitle+36)*3,heightTitle+465,250,50);
		jLabelQ10.setForeground(Color.white);
		jTextField5.setBounds((widthTitle+35)*3,heightTitle+500,230,20);
		jTextField5.setForeground(Color.white);
		jTextField5.setBackground(Color.black);
		jTextField5.setForeground(Color.white);
		jTextField5.setBorder(new LineBorder(Color.white));
		jButton5.setBounds((widthTitle+35)*3,heightTitle+530,230,20);
		jButton5.setForeground(Color.white);
		jButton5.setBackground(Color.black);
		jButton5.setForeground(Color.white);
		jButton5.setBorder(new LineBorder(Color.white));
		jButton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tAnswer5 = Integer.parseInt(jTextField5.getText());
				if(e.getSource() == jButton5 & tAnswer5 == answer5){
					buttonLevelSound.audio();
					buttonLevelSound.setVolume();
					jTextField5.setText(t);
					jFrameLevelTwo.setVisible(false);
					jFrameLevelTree.setVisible(true);
				}else{
					buttonAnswerSoundFalse.audio();
					buttonAnswerSoundFalse.setVolume();
					jTextField5.setText(f);
				}
			}
			
		});
		
		helpButton = new JButton("Помощь");
		jFrameLevelTwo.add(helpButton);
		helpButton.setBounds((widthTitle+35)*3,heightTitle+560,230,20);
		helpButton.setForeground(Color.white);
		helpButton.setBackground(Color.black);
		helpButton.setForeground(Color.white);
		helpButton.setBorder(new LineBorder(Color.white)); 
		helpButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == helpButton){
					buttonHelpSound.audio();
					buttonHelpSound.setVolume();
					helpFrame.setVisible(true);
				}
			}
			
		});
		
		jButtonImage1 = new JButton("1");
		jButtonImage1.setBounds((widthTitle - 170),heightTitle+600,140,160);
		jButtonImage1.setForeground(Color.white);
		jButtonImage1.setBackground(Color.black);
		jButtonImage1.setForeground(Color.white);
		jButtonImage1.setBorder(new LineBorder(Color.white));
		jButtonImage1.addActionListener(this);
		jFrameLevelTwo.add(jButtonImage1);

		jButtonImage2 = new JButton("2");
		jButtonImage2.setBounds((widthTitle + 10),heightTitle+600,140,160);
		jButtonImage2.setForeground(Color.white);
		jButtonImage2.setBackground(Color.black);
		jButtonImage2.setForeground(Color.white);
		jButtonImage2.setBorder(new LineBorder(Color.white));
		jButtonImage2.addActionListener(this);
		jFrameLevelTwo.add(jButtonImage2);
		
		jButtonImage3 = new JButton("3");
		jButtonImage3.setBounds((widthTitle + 92)*2,heightTitle+600,140,160);
		jButtonImage3.setForeground(Color.white);
		jButtonImage3.setBackground(Color.black);
		jButtonImage3.setForeground(Color.white);
		jButtonImage3.setBorder(new LineBorder(Color.white));
		jButtonImage3.addActionListener(this);
		jFrameLevelTwo.add(jButtonImage3);

		jButtonImage4 = new JButton("4");
		jButtonImage4.setBounds((widthTitle + 65)*3,heightTitle+600,140,160);
		jButtonImage4.setForeground(Color.white);
		jButtonImage4.setBackground(Color.black);
		jButtonImage4.setForeground(Color.white);
		jButtonImage4.setBorder(new LineBorder(Color.white));
		jButtonImage4.addActionListener(this);
		jFrameLevelTwo.add(jButtonImage4);
	}
	
	public void paint(Graphics g){
		g.drawImage(logoLevelTwo,(widthTitle+45)*3,heightTitle,600,600,null);
		g.drawImage(flagLevelTwo,(widthTitle+100)*3,heightTitle+20,100,100,null);
		g.drawImage(backgroundLevelTwo,widthTitle-170,heightTitle,600,600,null);
		if(b1==true){	
			g.drawImage(block1Level,widthTitle-170,heightTitle,300,300,null);
		}
		if(b2==true){	
			g.drawImage(block2Level,widthTitle-170,heightTitle+280,300,300,null);
		}
		if(b3==true){	
			g.drawImage(block3Level,widthTitle+125,heightTitle,300,300,null);	
		}
		if(b4==true){	
			g.drawImage(block4Level,widthTitle+125,heightTitle+280,300,300,null);		
		}
		
	}	
}