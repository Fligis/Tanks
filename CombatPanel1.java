import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class CombatPanel1 extends JPanel {

	private Tank1 t,t2;
	private Level1 l1;
	
	public void fire(int tank){
		Tank1 temp;
		if(tank==1)temp=t;
		else temp=t2;
		System.out.println("bullet fired");
		temp.fire();
	}


	public void update(){
		t.moveBullet();
		t2.moveBullet();
		
		Bullet b1=t.getBullet();
		Bullet b2=t2.getBullet();
		
		//tank 1 bullet
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
	    b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight()
	      ) ){
	          b1.setIsFired(false);
			  t.setX(100);
			  t.setY(590);
			  t2.setX(2350);
			  t2.setY(590);
		}
		//tank 2 bullet
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
	    b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight()
	      ) ){
	          b2.setIsFired(false);
	            t.setX(100);
			  t.setY(590);
			  t2.setX(2350);
			  t2.setY(590);
		}
		
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
		l1.geto1TopX(),l1.geto1TopY(),l1.geto1Width(),l1.geto1Height())){
			b1.setIsFired(false);
		}
		
		
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
		l1.geto1TopX(),l1.geto1TopY(),l1.geto1Width(),l1.geto1Height())){
			b2.setIsFired(false);
		}
		
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
		l1.geto2TopX(),l1.geto2TopY(),l1.geto2Width(),l1.geto2Height())){
			b1.setIsFired(false);
		}
		
		
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
		l1.geto2TopX(),l1.geto2TopY(),l1.geto2Width(),l1.geto2Height())){
			b2.setIsFired(false);
		}
		
		
		
		
	}
	
	
	
	public void moveDir(char c,int tank){
	Tank1 temp;
	if(tank==1)temp=t;
	else temp=t2;
	temp.move(c);
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
	      t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight()
	      )
	    ){
		if(c=='u')temp.setY(temp.getY()+35);
		if(c=='d')temp.setY(temp.getY()-35);
		if(c=='l')temp.setX(temp.getX()+35);
		if(c=='r')temp.setX(temp.getX()-35);
		}
				
				
				
		//Middle-left box		
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		l1.geto1TopX(),l1.geto1TopY(),l1.geto1Width(),l1.geto1Height()))
		{
		if(c=='u')temp.setY(temp.getY()+35);
		if(c=='d')temp.setY(temp.getY()-35);
		if(c=='l')temp.setX(temp.getX()+35);
		if(c=='r')temp.setX(temp.getX()-35);
		}
	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		l1.geto1TopX(),l1.geto1TopY(),l1.geto1Width(),l1.geto1Height()))
		{
		if(c=='u')temp.setY(temp.getY()+35);
		if(c=='d')temp.setY(temp.getY()-35);
		if(c=='l')temp.setX(temp.getX()+35);
		if(c=='r')temp.setX(temp.getX()-35);
		}
	
		//middle-right box
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		l1.geto2TopX(),l1.geto2TopY(),l1.geto2Width(),l1.geto2Height()))
		{
		if(c=='u')temp.setY(temp.getY()+35);
		if(c=='d')temp.setY(temp.getY()-35);
		if(c=='l')temp.setX(temp.getX()+35);
		if(c=='r')temp.setX(temp.getX()-35);
		}
	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		l1.geto2TopX(),l1.geto2TopY(),l1.geto2Width(),l1.geto2Height()))
		{
		if(c=='u')temp.setY(temp.getY()+35);
		if(c=='d')temp.setY(temp.getY()-35);
		if(c=='l')temp.setX(temp.getX()+35);
		if(c=='r')temp.setX(temp.getX()-35);
		}
	

	
	}

	public CombatPanel1(){
	   t=new Tank1(100,590);
	   t2=new Tank1(2350,590);
	   l1=new Level1(1);
	}

	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h)
	{
	    if ((b1_x > b2_x + b2_w - 1) || (b1_y > b2_y + b2_h - 1) || (b2_x > b1_x + b1_w - 1) || (b2_y > b1_y + b1_h - 1))   
	    {
	        // no collision
	        return false;
	    }

	    // collision
	    return true;
}

	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 600, 800);
		l1.draw(g);
		g.setColor(Color.GREEN);
		t.draw(g);
		t2.draw(g);

	}

}