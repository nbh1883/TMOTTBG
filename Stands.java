//Stands
import java.awt.*;
import java.applet.*;

public class Stands
{
	public static void main (String args[])
	{
   }
   public static void drawStands(Graphics g)
   {
      g.setColor(Color.gray);
      Polygon LS = new Polygon();
      LS.addPoint(200,350); //Left Stands
      LS.addPoint(500,650); //Left Stands
      LS.addPoint(420,650); //Left Stands
      LS.addPoint(120,350); //Left Stands
      g.fillPolygon(LS); //Left Stands
      
      Polygon RS = new Polygon();
      RS.addPoint(800,350); //Right Stands
      RS.addPoint(500,650); //Right Stands
      RS.addPoint(580,650); //Right Stands
      RS.addPoint(880,350); //Right Stands
      g.fillPolygon(RS); //Right Stands

   }
}