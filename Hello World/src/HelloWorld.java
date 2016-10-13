// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class HelloWorld extends Applet

{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		
	g.drawRect(50,50,300,300);
	g.drawRect(150,150,300,300);
	
	g.drawLine(50, 50, 150, 150);
	g.drawLine(50, 350, 150, 450);
	g.drawLine(350, 50, 450, 150);
	g.drawLine(350, 350, 450, 450);
	
	
		// DRAW SPHERE

	//(x, y, width, height)
	
	
		// DRAW TRIANGLE		
	}

}

