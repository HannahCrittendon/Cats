
// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Thing extends Applet {

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		Random rnd = new Random(1234);

		// Draw Random Lines

		Random rndInt = new Random(12345);

		for (int k = 1; k <= 1000; k++)

		{
			System.out.println("hi");
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);

			g.setColor(new Color(red, green, blue));

			int x1 = rndInt.nextInt(390) + 10;
			int y1 = rndInt.nextInt(290) + 10;
			int x2 = rndInt.nextInt(390) + 10;
			int y2 = rndInt.nextInt(290) + 10;
			g.drawLine(x1, y1, x2, y2);
		}
		// Draw Random Squares

		//
		// int x = rndInt.nextInt(1000);
		// int y = rndInt.nextInt(1500);
		//
		// g.setColor(new Color(red,green,blue));
		// g.fillRect(x,y,50,50);

		for (int k = 1; k <= 100; k++) {
			int x = rndInt.nextInt(344) + 400;
			int y = rndInt.nextInt(245) + 10;
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, 50, 50);
		}

		// Circles

		for (int k = 1; k <= 100; k++) {
			int x = rndInt.nextInt(300) + 10;
			int y = rndInt.nextInt(200) + 300;
			int x1 = rnd.nextInt(101);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, x1, x1);
		}

		// Cube

		g.setColor(Color.yellow);

		g.fillRect(550, 350, 100, 100);

		g.setColor(Color.red);

		g.fillRect(590, 390, 100, 100);

		// triangle

		g.setColor(Color.blue);

		int xpoints[] = { 650, 650, 690 };
		int ypoints[] = { 350, 390, 390 };
		int npoints = 3;

		g.fillPolygon(xpoints, ypoints, npoints);

		// square
		g.setColor(Color.green);
		int x1points[] = { 590, 550, 590, 550 };
		int y1points[] = { 350, 350, 490, 490 };
		int n1points = 4;

		g.fillPolygon(x1points, y1points, n1points);

	}

}