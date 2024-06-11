package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character 
{
	private String name;
	private HouseEnum house;
	private String patronus;
	private int level = 0;
	private int experience = 0;
	private int energy = 100;
	private Cauldron cauldron;
	private Wand wand;
	private Broomstick broomstick;
	private int health = 100;
	private List<Spell> spells = new ArrayList<>();
	private List<Mission> missions = new ArrayList<>();
	private List<Subject> subjects = new ArrayList<>();
	private List<Teacher> teachers = new ArrayList<>();
	
	public void castSpell() {callAttack();}

	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public HouseEnum getHouse() {return house;}
	public void setHouse(HouseEnum house) {this.house = house;}
	public String getPatronus() {return patronus;}
	public void setPatronus(String patronus) {this.patronus = patronus;}
	public int getLevel() {return level;}
	public void setLevel(int level) {this.level = level;}
	public int getExperience() {return experience;}
	public void setExperience(int experience) {this.experience = experience;}
	public int getEnergy() {return energy;}
	public void setEnergy(int energy) {this.energy = energy;}
	public Cauldron getCauldron() {return cauldron;}
	public void setCauldron(Cauldron cauldron) {this.cauldron = cauldron;}
	public Wand getWand() {return wand;}
	public void setWand(Wand wand) {this.wand = wand;}
	public Broomstick getBroomstick() {return broomstick;}
	public void setBroomstick(Broomstick broomstick) {this.broomstick = broomstick;}
	public int getHealth() {return health;}
	public void setHealth(int health) {this.health = health;}
	public List<Spell> getSpells() {return spells;}
	public void setSpells(List<Spell> spells) {this.spells = spells;}
	public List<Mission> getMissions() {return missions;}
	public void setMissions(List<Mission> missions) {this.missions = missions;}
	public List<Subject> getSubjects() {return subjects;}
	public void setSubjects(List<Subject> subjects) {this.subjects = subjects;}
	public List<Teacher> getTeachers() {return teachers;}
	public void setTeachers(List<Teacher> teachers) {this.teachers = teachers;}
	
	//add
	public void LearnSubject(Subject subject) 
	{
		subjects.add(subject);
		experience += subject.getExperienceReward();
		level += subject.getDifficultyLevel();
	}
	public void learnSpell(Spell spell)
	{
		spells.add(spell);
		experience += spell.getExperienceReward();
		level += spell.getDifficultyLevel();
		energy -= spell.getEnergyCost();
	}
	public void completeMission(Mission mission) 
	{
		if (!mission.isAccomplished())
		{
			missions.add(mission);
			experience += mission.getExperienceReward();
			level += 1;
			energy += mission.getEnergyReward();
			mission.setAccomplished(true);
		}
	}

}
