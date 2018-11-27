package zoo;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	String race = null;
	String surnom = null;
	String sexe = null;
	String tatou = null;
	List<Animal> accouple = new ArrayList<Animal>();

	
	public static final String EST_UNE_FEMELLE = "Femelle";
	public static final String EST_UN_MALE = "Male";
	
	public Animal(String race, String surnom, String sexe, String tatou) {
		super();
		this.race = race;
		this.surnom = surnom;
		this.sexe = sexe;
		this.tatou = tatou;
	}
	
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getTatou() {
		return tatou;
	}
	public void setTatou(String tatou) {
		this.tatou = tatou;
	}
	
	public String getSurnom() {
		return surnom;
	}
	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	
	@Override
	public String toString() {
		String msg ="";
		if (sexe.equals(EST_UN_MALE)) {
			msg = "L'animal ayant le surnom = " + surnom +" est un :" + race +" "+ sexe +" numéro -->" 
					+ tatou+" un accouplement à eu lieu avec \r\n"+accouple+" \r\n";
		}
		else {
			msg = "L'animal ayant le surnom = " + surnom +" est un :" + race +" "+ sexe +" numéro -->"+ tatou;
		}

		return msg;
	}
	
}
