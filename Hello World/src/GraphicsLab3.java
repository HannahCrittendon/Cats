	import java.awt.*;
	import java.applet.*;


	public class GraphicsLab3 extends Applet
	{
		public void paint(Graphics g)
		{
			
			int width = 980;
			int height = 630;
			g.drawRect(10, 10, width, height);	
			
			int x1 = 10;
			int y1 = 640;
			int x2 = 990;
			int y2 = 640;
			
			for(x1 = 10; x1 < 990; x1 += 14) {
			g.drawLine(x1, y1, x2, y2);
			y2 -= 9;
			
			
			
			}
			
			x1 = 990;
			y1 = 640;
			x2 = 10;
			y2 = 640;
			
			for(x1 = 990; x1 > 10; x1 -= 14) 
			{
			g.drawLine(x1, y1, x2, y2);	
			y2 -= 9;	
				
			}
			
            x1 = 990;
            y1 = 10;
            x2 = 640;
            y2 = 640;
            
			for(x1 = 640; x1 > 640; x1 -= 28) 
			{
			g.drawLine(x1, y1, x2, y2);	
			y2 -=  9;
				
			}
			{
			x1 = 990;
			y1 = 10;
			x2 = 10;
			y2 = 10;
				
			for(x1 = 990; x1 > 10; x1 -= 14) 
			{
				
			g.drawLine(x1, y1, x2, y2);
			y2 += 9;
								  
			}
			
			x1 = 10;
			y1 = 10;
			x2 = 990;
			y2 = 10;
				
			for(x1 = 10; x1 < 990; x1 += 14) 
			{
				
			g.drawLine(x1, y1, x2, y2);
			y2 += 9;
				
			
			
			
			
			}
			
			}
		}
	}
			
			
	
			


