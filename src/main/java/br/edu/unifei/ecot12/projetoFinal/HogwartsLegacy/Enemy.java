package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Enemy extends Character 
{
	private String type;
	private int attackSkills;
	private int damage = 0;
	private int blockade;
	
	public void counterAttack() {callAttack();};

	//get set
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public int getAttackSkills() {return attackSkills;}
	public void setAttackSkills(int attackSkills) {this.attackSkills = attackSkills;}
	public int getDamage() {return damage;}
	public void setDamage(int damage) {this.damage = damage;}
	public int getBlockade() {return blockade;}
	public void setBlockade(int blockade) {this.blockade = blockade;}
}
