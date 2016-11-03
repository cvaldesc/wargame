package inicioenjuegos;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InicioEnJuegos extends JPanel{
	
	Ball ball = new Ball(this);
	
	private void move(){
		ball.move();
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		ball.paint(g2d);
		
		
		// Dibujar formas 
		//g2d.setColor(Color.red);
		//g2d.fillOval(0,0,30,30);
		//g2d.fillOval(0, 0, 30, 30);
		//g2d.drawOval(0, 50, 30, 30);		
		//g2d.fillRect(50, 0, 30, 30);
		//g2d.drawRect(50, 50, 30, 30);
		//g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("probando juegos");
		//frame.setName("probando juegos");
		InicioEnJuegos juego = new InicioEnJuegos();
		frame.add(juego);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			juego.move();
			juego.repaint();
			Thread.sleep(10);
			
		}

	}

}
