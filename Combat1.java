import java.awt.event.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class Combat1 implements KeyListener,ActionListener{

	private JFrame window;
	private CombatPanel1 cp;
	private Timer timer;

	public Combat1() {
		window=new JFrame("Combat Game");
		cp=new CombatPanel1();
		window.add(cp);
		window.setSize(2500, 1230);
		timer=new Timer(100, this);
		timer.start();
		window.setVisible(true);
		window.addKeyListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		cp.update();
		cp.repaint();
	}
	
	public static void main(String[] args) {
		new Combat1();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("K"+e.getKeyCode());
		if(e.getKeyCode()==87){
			//W-UP
			cp.moveDir('u',1);

		}
		else if(e.getKeyCode()==83){
			//S-Down
			cp.moveDir('d',1);
		}else if(e.getKeyCode()==68){
			//A-Right
			cp.moveDir('r',1);
		}else if(e.getKeyCode()==65){
			//D-Left
			cp.moveDir('l',1);
		}else if(e.getKeyCode()==37){cp.moveDir('l',2);}
		else if(e.getKeyCode()==40){cp.moveDir('d',2);}
		else if(e.getKeyCode()==39){cp.moveDir('r',2);}
		else if(e.getKeyCode()==38){cp.moveDir('u',2);}
		else if(e.getKeyCode()==32){cp.fire(1);}
		else if(e.getKeyCode()==10){cp.fire(2);}


		cp.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

}