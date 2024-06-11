package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class CounterAttack implements Attack
{
	private Player player;
	private Enemy enemy;
	
	public void attack() 
	{
		if (player.getExperience()>50)player.setHealth(player.getHealth()-2);
		else player.setHealth(player.getHealth()-1);
	}
	
	// get set
	public Player getPlayer() {return player;}
	public void setPlayer(Player player) {this.player = player;}
	public Enemy getEnemy() {return enemy;}
	public void setEnemy(Enemy enemy) {this.enemy = enemy;}
}
