package pack6thread;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ex40ThreadWatch extends Frame implements Runnable {
	private Boolean b = false;
	Label lbl;

	/** Creates a new instance of ThreadWatch */

	final double POINTMIDDLEX = 160, POINTMIDDLEY = 160;

	public Ex40ThreadWatch() {
		super("시계");
		setBounds(200, 200, 300, 300);
		setVisible(true);
		new Thread(this).start();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				b = true;
				System.exit(0);
			}
		});
	}

	public void run() {
		while (true) {
			if (b == true)
				break;
			repaint();
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				
			}
		}
	}

	public void update(Graphics g) {
		Calendar cal = Calendar.getInstance();
		g.clearRect(0, 0, 300, 300);
		LineDraw(g);
		TimeDraw(g, Color.BLUE, cal.get(Calendar.SECOND), 360.0 / 60.0, 100.0);
		TimeDraw(g, Color.RED, cal.get(Calendar.MINUTE), 360.0 / 60.0, 100.0);
		TimeDraw(g, Color.GREEN, cal.get(Calendar.HOUR), 360.0 / 12.0, 70.0);
		// g.drawString();
	}

	public void LineDraw(Graphics g) {
		double dAngle = -90.0;
		for (int nCount = 0; nCount < 60; nCount++) {
			if ((nCount % 5) == 0)
				g.setColor(Color.BLACK);
			else
				g.setColor(Color.PINK);

			int nStartX = (int) (POINTMIDDLEY + (Math.cos(Math.PI * (dAngle / 180.0)) * 110));
			int nStartY = (int) (POINTMIDDLEY + (Math.sin(Math.PI * (dAngle / 180.0)) * 110));
			int nEndX = (int) (POINTMIDDLEY + (Math.cos(Math.PI * (dAngle / 180.0)) * 120));
			int nEndY = (int) (POINTMIDDLEY + (Math.sin(Math.PI * (dAngle / 180.0)) * 120));

			g.drawLine(nStartX, nStartY, nEndX, nEndY);
			dAngle += (360.0 / 60.0);
		}
	}

	void TimeDraw(Graphics g, Color color, double dAngle, double dSelect, double dSize) {
		g.setColor(color);
		dAngle *= dSelect;
		dAngle -= 90.0;

		if (dAngle < 0.0) dAngle -= 360.0;

		int nDestX = (int) (POINTMIDDLEX + (Math.cos(Math.PI * (dAngle / 180.0)) * dSize));
		int nDestY = (int) (POINTMIDDLEY + (Math.sin(Math.PI * (dAngle / 180.0)) * dSize));

		g.drawLine((int) POINTMIDDLEX, (int) POINTMIDDLEY, nDestX, nDestY);

	}

	public static void main(String ar[]) {

		new Ex40ThreadWatch();

	}

}