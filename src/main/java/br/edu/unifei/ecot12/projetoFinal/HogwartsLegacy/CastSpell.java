package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class CastSpell implements Attack 
{
	private Player player;
	private Enemy enemy;
	
	public void attack() 
	{
		if(enemy.getBlockade() > 50) enemy.setDamage(enemy.getDamage()+25);
		else enemy.setDamage(enemy.getDamage()+50);
		if (player.getLevel() > 50) enemy.setAttackSkills(enemy.getAttackSkills()-10);
		else enemy.setAttackSkills(enemy.getAttackSkills()-5);
	}

	//get set
	public Player getPlayer() {return player;}
	public void setPlayer(Player player) {this.player = player;}
	public Enemy getEnemy() {return enemy;}
	public void setEnemy(Enemy enemy) {this.enemy = enemy;}
}
