import java.awt.*;
import java.applet.*;

public class Field//Noah Code
{
	public static void main (String args[])
	{
   }
   public static void drawField(Graphics g)
   {
      //Field Colors
      Color Grass = new Color(0,153,0);
      Color Dirt = new Color(91,61,21);
      Color Bases = new Color(255,255,255);
      //Fill Field Stuff
      g.setColor(Grass); //Grass Color
      g.fillArc(200,133,600,433,360,180); //Outfield
      Polygon triangle = new Polygon();
      triangle.addPoint(200,350); //Infield/Out Grass
      triangle.addPoint(500,650); //Infield/Out Grass
      triangle.addPoint(800,350); //Infield/Out Grass
      g.fillPolygon(triangle); //Infield/Out
      g.setColor(Dirt); //Dirt Color
      Polygon infield = new Polygon();
      infield.addPoint(500,620);//Infield Dirt
      infield.addPoint(318,430);//Infield Dirt
      infield.addPoint(682,430);//Infield Dirt
      g.fillPolygon(infield);
      g.fillArc(318,300,364,260,360,180); //Infield
      g.setColor(Grass);
      Polygon grass = new Polygon();
      grass.addPoint(500,580);//Infield Grass
      grass.addPoint(400,480);//Infield Grass
      grass.addPoint(500,380);//Infield Grass
      grass.addPoint(600,480);//Infield Grass
      g.fillPolygon(grass);
      g.setColor(Dirt);
      g.fillOval(470,560,60,60); //Home Base Circle
      g.fillOval(480,460,40,40); //Pitcher Mound Circle
      g.setColor(Bases); //Base (White) Color
      g.fillRect(488,475,25,10); // Pitcher Mound Base
      Polygon home = new Polygon();
      home.addPoint(490,580);//Home Base
      home.addPoint(510,580);//Home Base
      home.addPoint(510,590);//Home Base
      home.addPoint(500,600);//Home Base
      home.addPoint(490,590);//Home Base
      g.fillPolygon(home);
      g.drawLine(500,600,207,300);//Left Line
      g.drawLine(500,600,793,300);//Right Line
      Polygon first = new Polygon();
      first.addPoint(600,480);//First Base
      first.addPoint(610,470);//First Base
      first.addPoint(620,480);//First Base
      first.addPoint(610,490);//First Base
      g.fillPolygon(first);
      Polygon second = new Polygon();
      second.addPoint(500,380);//Second Base
      second.addPoint(490,370);//Second Base
      second.addPoint(500,360);//Second Base
      second.addPoint(510,370);//Second Base
      g.fillPolygon(second);
      Polygon third = new Polygon();
      third.addPoint(400,480);//Third Base
      third.addPoint(390,470);//Third Base
      third.addPoint(380,480);//Third Base
      third.addPoint(390,490);//Third Base
      g.fillPolygon(third);
      Polygon cb1 = new Polygon();
      cb1.addPoint(630,495);//Coach Box 1
      cb1.addPoint(640,505);//Coach Box 1
      cb1.addPoint(610,535);//Coach Box 1
      cb1.addPoint(600,525);//Coach Box 1
      g.drawPolygon(cb1);
      Polygon cb2 = new Polygon();
      cb2.addPoint(370,495);//Coach Box 2
      cb2.addPoint(360,505);//Coach Box 2
      cb2.addPoint(390,535);//Coach Box 2
      cb2.addPoint(400,525);//Coach Box 2
      g.drawPolygon(cb2);




      //Field Outline
      g.setColor(Color.black);
      g.drawLine(200,350,500,650); //Left Side
      g.drawLine(500,650,800,350); //Right Side
      g.drawArc(200,133,600,433,360,180); //Back Side 
      
    
   }
}

