package zoo;

public class Main {

	public static void main(String[] args) {
		AnimalMemDao dao = new AnimalMemDao();
		
		dao.accouplement("Teddy1", "Tedda1");
		dao.accouplement("Teddy1", "Tedda2");
		dao.accouplement("Teddy1", "Tedda3");
		dao.accouplement("Teddy1", "Tedda4");
		dao.accouplement("Teddy2", "Tedda3");
		
		dao.findAllAnimals();

	}

}
