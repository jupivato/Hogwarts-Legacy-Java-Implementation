package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Teacher 
{
	private String name;
	private HouseEnum house;
	private Subject subject;
	
	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public HouseEnum getHouse() {return house;}
	public void setHouse(HouseEnum house) {this.house = house;}
	public Subject getSubject() {return subject;}
	public void setSubject(Subject subject) {this.subject = subject;}
}
