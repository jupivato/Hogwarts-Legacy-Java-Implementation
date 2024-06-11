package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Mission 
{
	private String title;
	private String description;
	private int experienceReward;
	private int energyReward;
	private boolean accomplished = false;
	
	// get set
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public int getExperienceReward() {return experienceReward;}
	public void setExperienceReward(int experienceReward) {this.experienceReward = experienceReward;}
	public int getEnergyReward() {return energyReward;}
	public void setEnergyReward(int energyReward) {this.energyReward = energyReward;}
	public boolean isAccomplished() {return accomplished;}
	public void setAccomplished(boolean accomplished) {this.accomplished = accomplished;}
}
