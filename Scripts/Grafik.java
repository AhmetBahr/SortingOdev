import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Grafik {
    
  public static void Start2(final int Step[]) {
    // Create a new frame
    JFrame frame = new JFrame("Grafik");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);

    JPanel panel = new JPanel() {

    	public void paint(Graphics g) {
        super.paintComponent(g);

        int x = 50;
        int y = 50;
        int width = 400;
        int height = 250;
        int columnWidth = 30;
        int gap = 10;
        
        int maxValue = 100;

        g.drawLine(x, y, x, y + height);
        g.drawLine(x, y + height, x + width, y + height);

        for (int i = 0; i < Step.length; i++) {
        	
            int value = Step[i];

            
          int columnHeight = (int)((double)value / maxValue * height);

          g.setColor(Color.black);
          g.fillRect(x + (columnWidth + gap) * i, y + height - (columnHeight*6), columnWidth, columnHeight*6);

          g.setColor(Color.black);
          g.drawString(String.valueOf(value), x + (columnWidth + gap) * i, y + height - (columnHeight*6) - 10);
        }
        g.drawString("Insert.", 45, 320);
        g.drawString("Select.", 85, 320);
        g.drawString("Bubble.", 130, 320);
        g.drawString("Shell.", 175, 320);
        g.drawString("Quick.", 210, 320);
        g.drawString("Count.", 248, 320);
        g.drawString("Merge.", 290, 320);
        g.drawString("Heap.", 330, 320);

      }
    };
    frame.add(panel);
    frame.setVisible(true);
  }
}