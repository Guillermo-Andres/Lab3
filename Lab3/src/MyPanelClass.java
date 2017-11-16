import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        g.setColor(Color.WHITE);
                        
                        
                        //Stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(0, (3*height)/5, width+1, height/5);
                        g.fillRect(0, (height)/5, width+1, height/5);
                        
                        //triangle
                        Polygon triangulo = new Polygon();
                        triangulo.addPoint(x1, y1);
                        triangulo.addPoint(width/2, height/2);
                        triangulo.addPoint(x1, y1+height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangulo);
                        
                      
                        //star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25*3, y1 + 73*3);
                        p2.addPoint(x1 + 41*3, y1 + 73*3);
                        p2.addPoint(x1 + 47*3, y1 + 58*3);
                        p2.addPoint(x1 + 53*3, y1 + 73*3);
                        p2.addPoint(x1 + 69*3, y1 + 73*3);
                        p2.addPoint(x1 + 56*3, y1 + 83*3);
                        p2.addPoint(x1 + 61*3, y1 + 98*3);
                        p2.addPoint(x1 + 47*3, y1 + 88*3);
                        p2.addPoint(x1 + 34*3, y1 + 98*3);
                        p2.addPoint(x1 + 38*3, y1 + 83*3);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
			}                      
                        
}