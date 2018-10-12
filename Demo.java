import java.util.Scanner;

class Demo{
	public static void main(String[] args) {
		System.out.println("Leuk dat je een tournooi organiseert. Hoe heet je tournooi?");
		Scanner scanner = new Scanner(System.in);
		String naamTournooi = scanner.nextLine();
		Tournooi karateTournooi = new Tournooi();
		karateTournooi.setNaam(naamTournooi);
		karateTournooi.welkom();
	}
}
class Tournooi{
	String naam;
	void welkom() {
		System.out.println("Welkom bij "+ naam);
	}
	void setNaam(String naam) {
		this.naam = naam;
	}
}