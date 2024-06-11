package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Spell 
{
	private String name;
	private String description;
	private int difficultyLevel;
	private int energyCost;
	private int experienceReward;
	
	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public int getDifficultyLevel() {return difficultyLevel;}
	public void setDifficultyLevel(int difficultyLevel) {this.difficultyLevel = difficultyLevel;}
	public int getEnergyCost() {return energyCost;}
	public void setEnergyCost(int energyCost) {this.energyCost = energyCost;}
	public int getExperienceReward() {return experienceReward;}
	public void setExperienceReward(int experienceReward) {this.experienceReward = experienceReward;}
}
