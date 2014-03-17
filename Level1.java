import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;

public class Level1 {


	//Middle-Left Box
	public int geto1TopX(){return 520;}
	public int geto1TopY(){return 550;}
	public int geto1Width(){ return 100;}
	public int geto1Height(){ return 100;}
	
	//Middle-right box
	public int geto2TopX(){return 1880;}
	public int geto2TopY(){return 550;}
	public int geto2Width(){ return 100;}
	public int geto2Height(){ return 100;}
	
	
  int level;
	public Level1(int l1) {
		level=l1;
	}
	
	
	
	   public void draw( Graphics g )
   {
      
	  g.setColor( Color.WHITE );
	  g.fillRect( 0, 0, 2500, 1230 );
	
	  	
	  //top left
      g.setColor( Color.BLACK );
      g.fillRect( 250, 150, 150, 60 );
      
      
      //top of the brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 190, 430, 70, 50 );
	  
	  //Middle of the brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 235, 430, 45, 350 );
	  
	  //bottom of the brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 190, 730, 70, 50 );
	  
	  //Bottom left
	  g.setColor( Color.BLACK );
	  g.fillRect( 250, 1010, 150, 60 );
	  
	  //Middle left
	  g.setColor( Color.BLACK );
	  g.fillRect( 520, 550, 100, 100 );
	  
	  //top of the top left brace
	  g.setColor( Color.BLACK );
      g.fillRect( 750, 290, 140, 40 );
      
      //bottom of the top left brace
      g.setColor( Color.BLACK );
      g.fillRect( 750, 290, 40, 90 );

	  //top of the bottom left brace
      g.setColor( Color.BLACK );
      g.fillRect( 750, 820, 40, 90 );

	  //Bottom of the bottom left brace
	  g.setColor( Color.BLACK );
      g.fillRect( 750, 870, 140, 40 );
      
      //top random square
      g.setColor( Color.BLACK );
	  g.fillRect( 1150, 0, 100, 100 );
	   
      //bottom random square
      g.setColor( Color.BLACK );
	  g.fillRect( 1150, 1100, 100, 100 );
	  
	  //top of the top right brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 1610, 290, 140, 40 );
	  
	  //bottom of the top right brace
      g.setColor( Color.BLACK );
      g.fillRect( 1710, 290, 40, 90 );
      
      //top of the bottom rihghth brace
      g.setColor( Color.BLACK );
      g.fillRect( 1610, 870, 140, 40 );
      
      //Bottom of the bottom right brace
	  g.setColor( Color.BLACK );
      g.fillRect( 1710, 820, 40, 90 );
	
	  //Middle wrightqt
	  g.setColor( Color.BLACK );
	  g.fillRect( 1880, 550, 100, 100 );
	  
	  //top of the brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 2240, 430, 90, 50 );
	  
	  //Middle of the brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 2240, 430, 45, 350 );
	  
	  //bottom of the right brace
	  g.setColor( Color.BLACK );
	  g.fillRect( 2240, 730, 90, 50 );
	  
	  //top right
      g.setColor( Color.BLACK );
      g.fillRect( 2100, 150, 150, 60 );
      
      //Bottom left
	  g.setColor( Color.BLACK );
	  g.fillRect( 2100, 1010, 150, 60 );
	}

}