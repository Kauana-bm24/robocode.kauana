package kau;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Kauana - a robot by (your name here)
 */
public class Kauana extends Robot
{
	/**
	 * run: Kauana's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(200);
			turnGunRight(360);
			back(200);
			turnGunRight(360);
			setAdjustGunForRobotTurn(true);  // Permite que a arma gire independentemente do corpo do robô
			// Gire o radar para escanear a área, mas com rotação menor
        	setTurnRadarRight(15);  // Gira o radar um pouco de cada vez
        	execute();  // Executa as ações
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(10);
		// Caso o inimigo seja eliminado ou não esteja mais perto
        	if (enemyDistance > 10) {
            	aggressiveMode = false;  // Desativa o modo agressivo
        	}
    	 else {
        	// Estratégia normal (perseguir ou fugir)
        	double turnToEnemy = Utils.normalRelativeAngleDegrees(enemyBearing - myHeading);
        	setTurnRight(turnToEnemy);  // Gira o robô para alinhar com o inimigo

        	// Gira a arma para apontar diretamente para o inimigo
        	setTurnGunRight(Utils.normalRelativeAngleDegrees(enemyBearing - getGunHeading()));

        	// Evitar bater nas bordas da arena
        	if (getX() < 50 || getX() > getBattleFieldWidth() - 50 || getY() < 50 || getY() > getBattleFieldHeight() - 50) 
		
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e); 
		// Replace the next line with any behavior you would like 
		back(50);
		
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}
	

	
}
