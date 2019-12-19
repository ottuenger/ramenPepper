package model;

import java.io.Serializable;

public class Account implements Serializable {
	private int userID;
	private String pass;
	private String name;
	private String mail;
	private String city;
	private int pork;
	private int soy;
	private int solt;
	private int miso;
	private int paitan;
	private int tsukemen;
	private int oil;
	private int tantan;
	private int tomato;
	private int heavy;
	private int lightly;
	private int nomal;
	private int spycy;
	private int hardness;
	private int non_hardness;
	private int thickness;
	private int non_thickness;
	private int seaweed;
	private int menma;
	private int sprouts;
	private int vegetable;
	private int allergy_seafood;
	private int allergy_soba;
	private int allergy_flour;
	private int allergy_egg;
	private int allergy_peanuts;
	private int allergy_dairy;
	private int vegetarian;
	private int vegan;
	private int halal;

	public Account(
		int userID,
		String pass,
		String name,
		String mail,
		String city,
		int pork,
		int soy,
		int solt,
		int miso,
		int paitan,
		int tsukemen,
		int oil,
		int tantan,
		int tomato,
		int heavy,
		int lightly,
		int nomal,
		int spycy,
		int hardness,
		int non_hardness,
		int thickness,
		int non_thickness,
		int seaweed,
		int menma,
		int sprouts,
		int vegetable,
		int allergy_seafood,
		int allergy_soba,
		int allergy_flour,
		int allergy_egg,
		int allergy_peanuts,
		int allergy_dairy,
		int vegetarian,
		int vegan,
		int halal) {

			this.userID = userID;
			this.pass = pass;
			this.name = name;
			this.city = city;
			this.pork = pork;
			this.soy = soy;
			this.solt = solt;
			this.miso = miso;
			this.paitan = paitan;
			this.tsukemen = tsukemen;
			this.oil = oil;
			this.tantan = tantan;
			this.tomato = tomato;
			this.heavy = heavy;
			this.lightly = lightly;
			this.nomal = nomal;
			this.spycy = spycy;
			this.hardness = hardness;
			this.non_hardness = hardness;
			this.thickness = thickness;
			this.non_thickness = non_thickness;
			this.seaweed = seaweed;
			this.menma = menma;
			this.sprouts = sprouts;
			this.vegetable = vegetable;
			this.allergy_seafood = allergy_seafood;
			this.allergy_soba = allergy_soba;
			this.allergy_flour = allergy_flour;
			this.allergy_egg = allergy_egg;
			this.allergy_peanuts = allergy_peanuts;
			this.allergy_dairy = allergy_dairy;
			this.vegetarian = vegetarian;
			this.vegan = vegan;
			this.halal = halal;

		}

	public int getUserID() {
		return userID;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getCity() {
		return city;
	}

	public int getPork() {
		return pork;
	}

	public int getSoy() {
		return soy;
	}

	public int getSolt() {
		return solt;
	}

	public int getMiso() {
		return miso;
	}

	public int getPaitan() {
		return paitan;
	}

	public int getTsukemen() {
		return tsukemen;
	}

	public int getOil() {
		return oil;
	}

	public int getTantan() {
		return tantan;
	}

	public int getTomato() {
		return tomato;
	}

	public int getHeavy() {
		return heavy;
	}

	public int getLightly() {
		return lightly;
	}

	public int getNomal() {
		return nomal;
	}

	public int getSpycy() {
		return spycy;
	}

	public int getHardness() {
		return hardness;
	}

	public int getNon_hardness() {
		return non_hardness;
	}

	public int getThickness() {
		return thickness;
	}

	public int getNon_thickness() {
		return non_thickness;
	}

	public int getSeaweed() {
		return seaweed;
	}

	public int getMenma() {
		return menma;
	}

	public int getSprouts() {
		return sprouts;
	}

	public int getVegetable() {
		return vegetable;
	}

	public int getAllergy_seafood() {
		return allergy_seafood;
	}

	public int getAllergy_soba() {
		return allergy_soba;
	}

	public int getAllergy_flour() {
		return allergy_flour;
	}

	public int getAllergy_egg() {
		return allergy_egg;
	}

	public int getAllergy_peanuts() {
		return allergy_peanuts;
	}

	public int getAllergy_dairy() {
		return allergy_dairy;
	}

	public int getVegetarian() {
		return vegetarian;
	}

	public int getVegan() {
		return vegan;
	}

	public int getHalal() {
		return halal;
	}
}
