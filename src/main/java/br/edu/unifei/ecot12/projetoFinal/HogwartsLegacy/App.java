package br.edu.unifei.ecot12.projetoFinal.HogwartsLegacy;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	public static void main(String[] args) 
	{
		// start creating NPCs
		// start magical creatures
		List<MagicalCreature>mcs = new ArrayList<MagicalCreature>();
		MCCreator magicCreatures = new MCCreator();
		MagicalCreature norbert = magicCreatures.newNpc();
		norbert.setName("Norbert");
		norbert.setType("Dragon");
		norbert.setMagicalFeatures("Able to fly and breathe fire through its nostrils and mouths.");
		mcs.add(norbert);
		MagicalCreature dobby = magicCreatures.newNpc();
		dobby.setName("Dobby");
		dobby.setType("Elf");
		dobby.setMagicalFeatures("Has access to its own brand of magic, the upper limit of its powers is unknown");
		mcs.add(dobby);
		MagicalCreature buckbeack = magicCreatures.newNpc();
		buckbeack.setName("Buckbeack");
		buckbeack.setType("Hippogriff");
		buckbeack.setMagicalFeatures("Half eagle, half horse, extremely fast, is able to fly around the Earth and to the Moon");
		mcs.add(buckbeack);
		MagicalCreature moaningMyrtle = magicCreatures.newNpc();
		moaningMyrtle.setName("Moaning Myrtle");
		moaningMyrtle.setType("Ghost");
		moaningMyrtle.setMagicalFeatures("Was once a wizard, can walk through walls and people.");
		mcs.add(moaningMyrtle);
		MagicalCreature thestral = magicCreatures.newNpc();
		thestral.setName("Thestral");
		thestral.setType("Thestral");
		thestral.setMagicalFeatures("Winged horse that can only be seen by those who have witnessed death.");
		mcs.add(thestral);
		MagicalCreature aragog = magicCreatures.newNpc();
		aragog.setName("Aragog");
		aragog.setType("Acromantula");
		aragog.setMagicalFeatures("Large vemonous spider covered in thin black hair, a carnivorous creature.");
		mcs.add(aragog);
		MagicalCreature phoenix = magicCreatures.newNpc();
		phoenix.setName("Fawkes");
		phoenix.setType("Phoenix");
		phoenix.setMagicalFeatures("A large swan-sized scarlet magical bird that never dies and has magical tears.");
		mcs.add(phoenix);
		// end magical creatures
		
		// start students
		List<Student>sts =  new ArrayList<Student>();
		SCreator students = new SCreator();
		Student ron = students.newNpc();
		ron.setName("Ronald Weasley");
		ron.setHouse(HouseEnum.GRYFFINDOR);
		sts.add(ron);
		Student ginny = students.newNpc();
		ginny.setName("Ginny Weasley");
		ginny.setHouse(HouseEnum.GRYFFINDOR);
		sts.add(ginny);
		Student harry = students.newNpc();
		harry.setName("Harry Potter");
		harry.setHouse(HouseEnum.GRYFFINDOR);
		sts.add(harry);
		Student cedric = students.newNpc(); 
		cedric.setName("Cedric Diggory");
		cedric.setHouse(HouseEnum.HUFFLEPUFF);
		sts.add(cedric);
		Student luna = students.newNpc(); 
		luna.setName("Luna Lovegood");
		luna.setHouse(HouseEnum.RAVENCLAW);
		sts.add(luna);
		Student draco = students.newNpc(); 
		draco.setName("Draco Malfoy");
		draco.setHouse(HouseEnum.SLYTHERIN);
		sts.add(draco);
		Student neville = students.newNpc(); 
		neville.setName("Neville Longbottom");
		neville.setHouse(HouseEnum.GRYFFINDOR);
		sts.add(neville);
		//end students
		//end creating NPCs
		
		//creating spells
		List<Spell>sps =  new ArrayList<Spell>();
		Spell wingardiumLeviosa = new Spell();
		wingardiumLeviosa.setName("Wingardium Leviosa");
		wingardiumLeviosa.setDescription("Makes things float");
		wingardiumLeviosa.setDifficultyLevel(2);
		wingardiumLeviosa.setEnergyCost(1);
		wingardiumLeviosa.setExperienceReward(1);
		sps.add(wingardiumLeviosa);
		Spell alohomora = new Spell();
		alohomora.setName("Alohomora");
		alohomora.setDescription("Opens doors");
		alohomora.setDifficultyLevel(1);
		alohomora.setEnergyCost(1);
		alohomora.setExperienceReward(2);
		sps.add(alohomora);
		Spell expectoPatronum = new Spell();
		expectoPatronum.setName("Expecto Patronum");
		expectoPatronum.setDescription("Makes a dementor go away by calling your patronus");
		expectoPatronum.setDifficultyLevel(4);
		expectoPatronum.setEnergyCost(2);
		expectoPatronum.setExperienceReward(3);
		sps.add(expectoPatronum);
		Spell riddikulus = new Spell();
		riddikulus.setName("Riddikulus");
		riddikulus.setDescription("Makes your boggart look riddiculous");
		riddikulus.setDifficultyLevel(4);
		riddikulus.setEnergyCost(2);
		riddikulus.setExperienceReward(3);
		sps.add(riddikulus);
		Spell expelliarmus = new Spell();
		expelliarmus.setName("Expelliarmus");
		expelliarmus.setDescription("Makes oponent lose their wand");
		expelliarmus.setDifficultyLevel(4);
		expelliarmus.setEnergyCost(2);
		expelliarmus.setExperienceReward(5);
		sps.add(expelliarmus);
		Spell crucio = new Spell();
		crucio.setName("Crucio");
		crucio.setDescription("Tortures a victim");
		crucio.setDifficultyLevel(10);
		crucio.setEnergyCost(10);
		crucio.setExperienceReward(15);
		expelliarmus.setExperienceReward(5);
		sps.add(crucio);
		Spell avadaKedavra = new Spell();
		avadaKedavra.setName("Avada Kedavra");
		avadaKedavra.setDescription("Kills your oponent instantly (well, sometimes it doesn't...)");
		avadaKedavra.setDifficultyLevel(100);
		avadaKedavra.setEnergyCost(100);
		avadaKedavra.setExperienceReward(100);
		sps.add(avadaKedavra);
		//end creating spells
		
		// creating missions 
		List<Mission>mss = new ArrayList<Mission>();
		Mission mission1 = new Mission();
		mission1.setTitle("Troll! In the dungeons!!");
		mission1.setDescription("Professor Flitwick just warned everyone: there is a Troll in the dungeons. It's in the girl's bathroom, fight him.");
		mission1.setEnergyReward(50);
		mission1.setExperienceReward(15);
		mss.add(mission1);
		Mission mission2 = new Mission();
		mission2.setTitle("I hear voices");
		mission2.setDescription("You found out Ginny is being held at the secret chamber by Tom Riddle, fight the basilisc that lives there and save your friend");
		mission2.setEnergyReward(50);
		mission2.setExperienceReward(15);
		mss.add(mission2);
		Mission mission3 = new Mission();
		mission3.setTitle("Here, have a chocolate and relax");
		mission3.setDescription("A dementor is attacking you, use your DADA knowledge and send him away!");
		mission3.setEnergyReward(50);
		mission3.setExperienceReward(15);
		mss.add(mission3);
		Mission mission4 = new Mission();
		mission4.setTitle("Did you put your name in the goblet of fire???");
		mission4.setDescription("You've been selected for the triwizard tournament, now you have to fight this dragon and survive...");
		mission4.setEnergyReward(50);
		mission4.setExperienceReward(15);
		mss.add(mission4);
		Mission mission5 = new Mission();
		mission5.setTitle("I killed Sirius Black");
		mission5.setDescription("Bellatrix just killed Sirius Black and is now attacking you, fight her!");
		mission5.setEnergyReward(50);
		mission5.setExperienceReward(15);
		mss.add(mission5);
		Mission mission6 = new Mission();
		mission6.setTitle("What is Draco doing?");
		mission6.setDescription("After joining the dark side, Draco let death eaters enter hogwarts, defeat one of them");
		mission6.setEnergyReward(50);
		mission6.setExperienceReward(15);
		mss.add(mission6);
		Mission mission7 = new Mission();
		mission7.setTitle("The girl who lived...");
		mission7.setDescription("This is your final battle, Voldemort is trying to take over the wizarding world, don't let him.");
		mission7.setEnergyReward(100);
		mission7.setExperienceReward(100);
		mss.add(mission7);
		// end creating missions
		
		//creating player stuff
		Cauldron cauldron = new Cauldron();
		cauldron.setSize(10);
		cauldron.setMetal("Steel");
		Wand wand = new Wand();
		wand.setCore("Dragon heartstring");
		wand.setFlexibility(5);
		wand.setLength(10);
		wand.setWood("Vine");
		Broomstick broom = new Broomstick();
		broom.setName("Nimbus 2000");
		broom.setResistance(50);
		broom.setSeriesNumber(2000);
		broom.setWood("Vine");
		// end creating player stuff
		
		//start creating subjects
		List<Subject>sjs = new ArrayList<Subject>();
		Subject charms = new Subject();
		charms.setName("Charms");
		charms.setExperienceReward(10);
		charms.setDifficultyLevel(5);
		sjs.add(charms);
		Subject herbology = new Subject();
		herbology.setName("Herbology");
		herbology.setExperienceReward(10);
		herbology.setDifficultyLevel(5);
		sjs.add(herbology);
		Subject transfiguration = new Subject();
		transfiguration.setName("Transfiguration");
		transfiguration.setExperienceReward(10);
		transfiguration.setDifficultyLevel(5);
		sjs.add(transfiguration);
		Subject divination = new Subject(); 
		divination.setName("Aritmancy");
		divination.setExperienceReward(10);
		divination.setDifficultyLevel(5);
		sjs.add(divination);
		Subject potions = new Subject(); 
		potions.setName("Potions");
		potions.setExperienceReward(10);
		potions.setDifficultyLevel(5);
		sjs.add(potions);
		Subject careOfMagicalCreatures = new Subject(); 
		careOfMagicalCreatures.setName("Aritmancy");
		careOfMagicalCreatures.setExperienceReward(10);
		careOfMagicalCreatures.setDifficultyLevel(5);
		sjs.add(careOfMagicalCreatures);
		Subject dada = new Subject(); 
		dada.setName("Defense against the dark arts");
		dada.setExperienceReward(10);
		dada.setExperienceReward(5);
		sjs.add(dada);
		//end creating subject
		
		//useful in missions
		CastSpell fight = new CastSpell();
		CounterAttack beat = new CounterAttack();
		//useful in missions 
		
		//creating enemies

		List<Enemy>enm = new ArrayList<Enemy>();
		Enemy troll = new Enemy();
		troll.setType("Troll");
		troll.setBlockade(20);
		troll.setAttackSkills(30);
		enm.add(troll);
		Enemy basilisc = new Enemy();
		basilisc.setType("Basilisc");
		basilisc.setBlockade(20);
		basilisc.setAttackSkills(30);
		enm.add(basilisc);
		Enemy dementor = new Enemy();
		dementor.setType("Dementor");
		dementor.setBlockade(20);
		dementor.setAttackSkills(30);
		enm.add(dementor);
		Enemy dragon = new Enemy();
		dragon.setType("Dragon");
		dragon.setBlockade(20);
		dragon.setAttackSkills(30);
		enm.add(dragon);
		Enemy bellatrix= new Enemy();
		bellatrix.setType("Bellatrix");
		bellatrix.setBlockade(20);
		bellatrix.setAttackSkills(30);
		enm.add(bellatrix);
		Enemy deathEater = new Enemy();
		deathEater.setType("Death Eater");
		deathEater.setBlockade(20);
		deathEater.setAttackSkills(30);
		enm.add(deathEater);
		Enemy voldemort = new Enemy();
		voldemort.setType("Voldemort");
		voldemort.setBlockade(20);
		voldemort.setAttackSkills(30);
		enm.add(voldemort);
		//end creating enemies
		
		//start creating teachers
		List<Teacher>tcs = new ArrayList<Teacher>();
		Teacher flitwick = new Teacher();
		flitwick.setName("Filius Flitwick");
		flitwick.setHouse(HouseEnum.RAVENCLAW);
		flitwick.setSubject(charms);
		tcs.add(flitwick);
		Teacher sprout = new Teacher();
		sprout.setName("Pomona Sprout");
		sprout.setHouse(HouseEnum.HUFFLEPUFF);
		sprout.setSubject(herbology);
		tcs.add(sprout);
		Teacher mcgonnagal = new Teacher();
		mcgonnagal.setName("Minerva McGonnagal");
		mcgonnagal.setHouse(HouseEnum.GRYFFINDOR);
		mcgonnagal.setSubject(transfiguration);
		tcs.add(mcgonnagal);
		Teacher treelawney = new Teacher();
		treelawney.setName("Sibila Treelawney");
		treelawney.setHouse(HouseEnum.RAVENCLAW);
		treelawney.setSubject(transfiguration);
		tcs.add(treelawney);
		Teacher snape = new Teacher();
		snape.setName("Severus Snape");
		snape.setHouse(HouseEnum.SLYTHERIN);
		snape.setSubject(potions);
		tcs.add(snape);
		Teacher hagrid = new Teacher();
		hagrid.setName("Rubeo Hagrid");
		hagrid.setHouse(HouseEnum.GRYFFINDOR);
		hagrid.setSubject(careOfMagicalCreatures);
		tcs.add(hagrid);
		Teacher lupin = new Teacher();
		lupin.setName("Remus Lupin");
		lupin.setHouse(HouseEnum.GRYFFINDOR);
		lupin.setSubject(dada);
		tcs.add(lupin);
		//end creating teachers
		
		//start creating player
		Player player = new Player();
		player.setName("Hermione Granger");
		player.setHouse(HouseEnum.GRYFFINDOR);
		player.setPatronus("Otter");
		player.setCauldron(cauldron);
		player.setWand(wand);
		player.setBroomstick(broom);
		//end creating player
		
		//start game
		System.out.println("WELCOME TO HOGWARTS");
		System.out.println();
		
		for(int i = 0; i < 7; i++)
		{
			String year = null;
			switch(i)
			{
				case 0:
					year = "first";
					break;
				case 1: 
					year = "second";
					break;
				case 2: 
					year = "third";
					break;
				case 3: 
					year = "fourth";
					break;
				case 4: 
					year = "fifth";
					break;
				case 5: 
					year = "sixth";
					break;
				case 6: 
					year = "seventh";
					break;
			}
			System.out.println("Welcome, this is your "+ year +" year at Hogwarts!");
			System.out.println();
			System.out.println("*****This is your information:*****");
			System.out.println("Name: "+player.getName());
			System.out.println("House: "+player.getHouse());
			System.out.println("Level: "+player.getLevel());
			System.out.println("Experience: "+player.getExperience());
			System.out.println("Energy: "+player.getEnergy());
			System.out.println("Health: "+player.getHealth());
			System.out.println("***********************************");
			System.out.println();
			System.out.println("-> As you're living in Hogwarts you got to know a new friend");
			System.out.println("Name: "+sts.get(i).getName());
			System.out.println("House: "+sts.get(i).getHouse());
			System.out.println();
			System.out.println("-> This year you also learned about a magical creature:");
			System.out.println("Name: "+mcs.get(i).getName());
			System.out.println("Type: "+mcs.get(i).getType());
			System.out.println("Magical features: "+mcs.get(i).getMagicalFeatures());
			System.out.println();
			System.out.println("This is your new teacher: ");
			System.out.println("Name: Professor "+tcs.get(i).getName());
			System.out.println("House: "+tcs.get(i).getHouse());
			System.out.println("Subject: "+tcs.get(i).getSubject().getName());
			System.out.println();
			System.out.println("You just learned a new spell!");
			System.out.println("Name: "+sps.get(i).getName());
			System.out.println("Description: "+sps.get(i).getDescription());
			player.learnSpell(sps.get(i));
			player.LearnSubject(sjs.get(i));
			System.out.println();
			System.out.println("THERE IS A NEW MISSION!");
			System.out.println("Title: "+mss.get(i).getTitle());
			System.out.println("Description: "+mss.get(i).getDescription());
			System.out.println("Energy Reward: "+mss.get(i).getEnergyReward());
			System.out.println("Experience Reward: "+mss.get(i).getExperienceReward());
			System.out.println("Mission completed? "+mss.get(i).isAccomplished());
			System.out.println();
			System.out.println("GET TO KNOW YOUR ENEMY: ");
			System.out.println("Type: "+enm.get(i).getType());
			System.out.println("Blockade: "+enm.get(i).getBlockade());
			System.out.println("Attack Skills: "+enm.get(i).getAttackSkills());
			System.out.println("Damage: "+enm.get(i).getDamage());
			player.setAttack(fight);
			enm.get(i).setAttack(beat);
			fight.setPlayer(player);
			beat.setPlayer(player);
			fight.setEnemy(enm.get(i));
			beat.setEnemy(enm.get(i));
			player.castSpell();
			enm.get(i).counterAttack();
			player.castSpell();
			player.completeMission(mss.get(i));
			System.out.println();
			System.out.println("Mission completed? "+mss.get(i).isAccomplished());
			System.out.println();
			System.out.println("This is your enemy now:");
			System.out.println("Type: "+enm.get(i).getType());
			System.out.println("Blockade: "+enm.get(i).getBlockade());
			System.out.println("Attack Skills: "+enm.get(i).getAttackSkills());
			System.out.println("Damage: "+enm.get(i).getDamage());
			System.out.println();
			System.out.println("This is the end of your "+ year +" in Hogwarts!");
			System.out.println();
			System.out.println("***********************************");
			System.out.println();
		}
		System.out.println("Congratulations, "+ player.getName() + ", you gratuated Hogwarts after these unforgettable adventures!");
	}
}