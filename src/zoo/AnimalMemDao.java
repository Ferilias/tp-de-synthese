package zoo;

import java.util.*;

public class AnimalMemDao implements IAnimal {

	List<Animal> animaux = new ArrayList<Animal>();	
{
		animaux.add(new Animal("Lion", "Teddy1", Animal.EST_UN_MALE, "M01"));
		animaux.add(new Animal("Lion", "Tedda1", Animal.EST_UNE_FEMELLE, "F01"));
		animaux.add(new Animal("Lion", "Teddy2", Animal.EST_UN_MALE, "M02"));
		animaux.add(new Animal("Lion", "Tedda2", Animal.EST_UNE_FEMELLE, "F02"));
		animaux.add(new Animal("Lion", "Teddy3", Animal.EST_UN_MALE, "M03"));
		animaux.add(new Animal("Lion", "Tedda3", Animal.EST_UNE_FEMELLE, "F03"));
		animaux.add(new Animal("Lion", "Teddy4", Animal.EST_UN_MALE, "M04"));
		animaux.add(new Animal("Lion", "Tedda4", Animal.EST_UNE_FEMELLE, "F04"));
}


	@Override
	public List<Animal> findAllAnimals() {
		for (Animal animal : animaux) {
			System.out.println(animal.toString());		
			}
		return animaux;
		}		

	@Override
	public void updateAnimal(String surnomAnimal, Animal animalAupdate) {
		if (findAnimalBySurnom(surnomAnimal)!=null) {
			Animal animalUpdate = findAnimalBySurnom(surnomAnimal);
			animalUpdate.setSurnom(animalAupdate.getSurnom());
			animalUpdate.setRace(animalAupdate.getRace());
			animalUpdate.setTatou(animalAupdate.getTatou());
		}
	}

	@Override
	public Animal findAnimalBySurnom(String surnomAnimal) {
			Animal animal = null;
			for (Animal animal2 : animaux) {
				if (surnomAnimal.equals(animal2.getSurnom())) {
					animal = animal2;
				}
			}
			
			return animal;
		}
	

	@Override
	public boolean isAnimalExists(String surnomAnimal) {
		return findAnimalBySurnom(surnomAnimal)!=null ;
	}

	@Override
	public void addAnimal(Animal newAnimal) {
			animaux.add(newAnimal);
		}			

	@Override
	public void deleteAnimal(String surnomAnimal) {
		if(findAnimalBySurnom(surnomAnimal)!=null) {
			animaux.remove(findAnimalBySurnom(surnomAnimal));
		}
	}
	public void accouplement (String surnomAnimalM, String surnomAnimalF) {
		
		findAnimalBySurnom(surnomAnimalM).accouple.add(findAnimalBySurnom(surnomAnimalF));
	}

}
