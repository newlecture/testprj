package com.newlecture.ejin;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameCanvas extends Canvas implements KeyListener, MouseListener{
		
	private Fighter fighter;
	private Background background;
	private static GameCanvas instance;
	
	public GameCanvas() {		
		instance = this;
				
		background = new Background();
		fighter = new Fighter();	
		
		addKeyListener(this);
		addMouseListener(this);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while(true) {
					
					fighter.update();
					
					try {
						Thread.sleep(17);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					repaint();
				}
				
			}
		}).start();
		
	}
	
	public static GameCanvas getInstance() {
		return instance;
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		//super.update(g);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		//background.draw(g);
		fighter.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		fighter.move(100, 100);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		fighter.move(x, y);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
