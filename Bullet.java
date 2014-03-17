
import java.awt.Graphics;
import java.awt.*;


public class Bullet{

private int x,y;
private boolean isFired;
private  int xspeed;
private  int yspeed;
private final int BULLET_W=5;
private final int BULLET_H=5;


public void setX(int i){x=i;}
public void setY(int i){y=i;}


public void setIsFired(boolean b){
	isFired=b;
}
public boolean getIsFired(){ return isFired;}

public void setXSpeed(int i){
	xspeed=i;
}

public void setYSpeed(int i){
	yspeed=i; 
}

public void fire(char tankDirection,int bulletx,int bullety){
         x=bulletx;
         y=bullety;
	if(tankDirection=='u'){setXSpeed(0);setYSpeed(-40);}
	if(tankDirection=='d'){setXSpeed(0);setYSpeed(40);}
	if(tankDirection=='r'){setXSpeed(40);setYSpeed(0);}
	if(tankDirection=='l'){setXSpeed(-40);setYSpeed(0);}
	isFired=true;
	System.out.println("tank dir xspeed yspeed"+tankDirection+" "+xspeed+" "+yspeed);
}



public Bullet(){
 x=0;
 y=0;
 isFired=false;
 xspeed=0;
 yspeed=0;
}

public Bullet(int _x,int _y,boolean _isFired){
 x=_x;
 y=_y;
 isFired=_isFired;
 xspeed=0;
 yspeed=0;
}


public void move(){
System.out.println("bullet ("+x+","+y+")");
 x=x+xspeed;
 y=y+yspeed;
 if(x>2500) {isFired=false;x=0;y=0;}
 if(x<0) {isFired=false;x=0;y=0;}
if(y>2500) {isFired=false;x=0;y=0;}
 if(y<0) {isFired=false;x=0;y=0;}

}

public void draw(Graphics g){
	System.out.println("drawn");
   if(isFired){
   g.drawRect(x,y,BULLET_W,BULLET_H);

   }
}
public int getTopX(){return x;}
public int getTopY(){ return y;}
public int getWidth(){return BULLET_W;}
public int getHeight(){return BULLET_W;}

}