package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class MagicalCreature extends Npc 
{
	private String type;
	private String magicalFeatures;
	
	protected MagicalCreature(){}

	//get set
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public String getMagicalFeatures() {return magicalFeatures;}
	public void setMagicalFeatures(String magicalFeatures) {this.magicalFeatures = magicalFeatures;};
}
