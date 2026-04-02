//Stadium
import java.awt.*;
import java.applet.*;

public class Stadium//Saransh Code
{
	public static void main (String args[])
	{
   }
   public static void drawStadium(Graphics g)
   {
      g.setColor(Color.gray);
      Polygon LS = new Polygon();
      LS.addPoint(200,350); //Left Stands
      LS.addPoint(500,650); //Left Stands
      LS.addPoint(420,650); //Left Stands
      LS.addPoint(120,350); //Left Stands
      g.fillPolygon(LS); //Left Stands
      g.setColor(Color.black);
      g.drawPolygon(LS);
      
      g.setColor(Color.gray);
      Polygon RS = new Polygon();
      RS.addPoint(801,350); //Right Stands
      RS.addPoint(501,650); //Right Stands
      RS.addPoint(581,650); //Right Stands
      RS.addPoint(881,350); //Right Stands
      g.fillPolygon(RS); //Right Stands
      g.setColor(Color.black);
      g.drawPolygon(RS);
      
      g.setColor(Color.gray);
      Polygon LS2 = new Polygon();
      LS2.addPoint(120,350); //Back Left Stands
      LS2.addPoint(420,650); //Back Left Stands
      LS2.addPoint(340,650); //Back Left Stands
      LS2.addPoint(40,350); //Bacj Left Stands
      g.fillPolygon(LS2); //Back Left Stands
      g.setColor(Color.black);
      g.drawPolygon(LS2);
      
      g.setColor(Color.gray);
      Polygon RS2 = new Polygon();
      RS2.addPoint(881,350); //Back Right Stands
      RS2.addPoint(581,650); //Back Right Stands
      RS2.addPoint(661,650); //Back Right Stands
      RS2.addPoint(961,350); //Back Right Stands
      g.fillPolygon(RS2); //Back Right Stands
      g.setColor(Color.black);
      g.drawPolygon(RS2);
      
      g.setColor(Color.gray);
      g.fillArc(40,33,920,633,360,180); //Back Stands
      g.setColor(Color.black);
      g.drawArc(120,83,760,533,360,180);
      g.drawArc(40,33,920,633,360,180);
   }
}