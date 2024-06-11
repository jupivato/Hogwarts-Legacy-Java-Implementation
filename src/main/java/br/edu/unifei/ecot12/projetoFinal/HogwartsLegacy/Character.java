package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public abstract class Character 
{
	private Attack attack;
	
	protected void callAttack() {attack.attack();}
	
	//get set
	public Attack getAttack() {return attack;}
	public void setAttack(Attack attack) {this.attack = attack;}
}
