package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Student extends Npc 
{
	private HouseEnum house;
	
	protected Student() {}

	//get set
	public HouseEnum getHouse() {return house;}
	public void setHouse(HouseEnum house) {this.house = house;};
}
