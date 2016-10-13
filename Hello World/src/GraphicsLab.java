
// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	g.drawRect(10, 20, 300, 300);
	g.drawRect(100, 100, 300, 300);	
	g.drawLine(10, 20, 100, 100);
	g.drawLine(10, 320, 100, 400);
	g.drawLine(310, 320, 400, 400);
	g.drawLine(310, 20, 400, 100);
		// DRAW SPHERE
	g.drawOval(1250, 30, 200, 300);	
	g.drawOval(1250, 125, 300, 300);
			

		
		// DRAW TRIANGLE		
	}

}


