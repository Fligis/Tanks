import java.awt.*;


public class Tank1 {
	
	private Bullet b1;
	private int x;
	private int y;
	private char direction;
	private boolean box;
	
	
public Bullet getBullet(){return b1;}


public void moveBullet(){
	b1.move();
}
public void fire(){
	System.out.println("Entered Fire");
	b1.setX(x);b1.setY(y);
	b1.fire(direction,x,y);
		if(b1.getIsFired())return;
}
	public int getX(){return x;}
	public void setX(int i){x=i;}
	public int getY(){return y;}
	public void setY(int i){y=i;}
	public void moveLeft(){
		x=x-35;
	}
	public void moveRight(){
		x=x+35;
	}
	public void moveUp(){
		y=y-35;
	}
	public void moveDown(){
		y=y+35;
	}
	public void move(char dir){
	direction=dir;
	 if(dir=='u'){y-=35;
	 }else if(dir=='d'){y+=35;
	 }else if(dir=='r'){x+=35;
	 }else if(dir=='l'){x-=35;
	 }

	}





	public Tank1(int _x,int _y) {
		x=_x;
		y=_y;
		direction='l';
		b1=new Bullet(x,y,false);
		
	}

	public void draw(Graphics g){

		//center
		g.fillRect(x+0, y+0, 60, 60);
		
		
		//treads
		g.setColor(Color.BLACK);
		if(direction=='u'|| direction=='d'){
			g.fillRect(x-15, y-10, 20, 85);
			g.fillRect(x+45, y-10, 20, 85);
		}else if(direction=='l'||direction=='r'){
			g.fillRect(x-10, y-20, 85, 20);
			g.fillRect(x-10, y+40, 85, 20);

		}
		if(direction=='u'){
		g.setColor(Color.BLUE);
		g.drawLine(x-17, y-22, x+67, y-22);
		g.drawLine(x-17, y+80, x+67,y+80);
		g.drawLine(x-17, y+80, x-17,y-22);
		g.drawLine(x+67, y-22, x+67,y+80);
		}
		if(direction=='d'){
			g.setColor(Color.BLUE);
			g.drawLine(x-17, y-12, x+67, y-12);
			g.drawLine(x-17, y+80, x+67,y+80);
			g.drawLine(x-17, y+80, x-17,y-12);
			g.drawLine(x+67, y-12, x+67,y+80);
			}
		
		if(direction=='l'){
			g.setColor(Color.BLUE);
			g.drawLine(x-30, y-22, x+77, y-22);
			g.drawLine(x-30, y+62, x+77,y+62);
			g.drawLine(x-30, y+62, x-30, y-22);
			g.drawLine(x+77, y-22, x+77,y+62);	}
		if(direction=='r'){
			g.setColor(Color.BLUE);
			g.drawLine(x-15, y-22, x+87, y-22);
			g.drawLine(x-15, y+62, x+87,y+62);
			g.drawLine(x-15, y+62, x-15, y-22);
			g.drawLine(x+87, y-22, x+87,y+62);}
		
		//turret mgee 123 your mother and me 
		g.setColor(Color.BLACK);

		if(direction=='u')g.fillRect(x+15, y-20, 20, 40);
		if(direction=='d')g.fillRect(x+15, y+40, 20, 40);
		if(direction=='r')g.fillRect(x+45, y+10, 40, 20);
		if(direction=='l')g.fillRect(x-25, y+10, 40, 20);

		g.setColor(Color.BLUE);
		b1.draw(g);
	}
		private int top_x,top_y,width,height;

	public int getTopX(){if(direction=='u'||direction=='d')return x-21; return x-34;}
	public int getTopY(){if(direction=='u'||direction=='d')return y-26; return y-16;}
	public int getWidth(){if(direction=='u'||direction=='d')return 86; return 115;}
	public int getHeight(){if(direction=='u'||direction=='d')return 115; return 86;}


}
