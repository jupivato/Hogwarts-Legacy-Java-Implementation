package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

public class Subject 
{
	private String name;
	private int difficultyLevel;
	private int experienceReward;
	private Teacher teacher;
	
	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getDifficultyLevel() {return difficultyLevel;}
	public void setDifficultyLevel(int difficultyLevel) {this.difficultyLevel = difficultyLevel;}
	public int getExperienceReward() {return experienceReward;}
	public void setExperienceReward(int experienceReward) {this.experienceReward = experienceReward;}
	public Teacher getTeacher() {return teacher;}
	public void setTeacher(Teacher teacher) {this.teacher = teacher;}
}
