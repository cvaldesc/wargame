package inicioenjuegos;

import java.awt.Graphics2D;

public class Ball {
	
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private InicioEnJuegos juego;
	
	public Ball(InicioEnJuegos juego){
		this.juego = juego;
	}
	
	void move(){
		if(x + xa < 0 ){
			xa =1;
		}
		if(x + xa > juego.getWidth() - 30){
			xa = -1;
		}
		if(y + ya <0){
			ya = 1;
		}
		if(y + ya > juego.getHeight() -30){
			ya = -1;
		}
		
		x = x + ya;
		y = y + ya;
	}
	
	public void paint(Graphics2D g){
		g.fillOval(x, y, 30, 30);
	}
}