package zoo;

import java.util.List;


public interface IAnimal {
	
	List<Animal> findAllAnimals();
	
	void updateAnimal(String surnomAnimal, Animal animalAupdate) ;
	
	Animal findAnimalBySurnom(String surnomAnimal);
	
	boolean isAnimalExists(String surnomAnimal);
	
	void addAnimal(Animal animal);
	
	void deleteAnimal(String surnomanimal);
}
