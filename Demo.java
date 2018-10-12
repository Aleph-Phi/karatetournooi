import java.util.ArrayList;
import java.util.Scanner;

class Demo{
	public static void main(String[] args) {
		System.out.println("Leuk dat je een tournooi organiseert. \n Hoe heet je tournooi?");
		Scanner scanner = new Scanner(System.in);
		String naamTournooi = scanner.nextLine();
		Tournooi karateTournooi = new Tournooi();
		karateTournooi.setNaam(naamTournooi);
		karateTournooi.welkom();

		System.out.println("Wil u al mensen aanmelden? \n 1 ja 2 nee");
		int antwoordNogEen = scanner.nextInt();
		if(antwoordNogEen == 1) {
			System.out.println("je hebt 1 gedrukt");
			karateTournooi.voegDeelnemersToe();
		}else {
			System.out.println("wordt een kort tournooi");
		}
		System.out.println(karateTournooi.deelnemers);
	}
}
class Tournooi{
	String naam;
	ArrayList<Deelnemer> deelnemers = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	void welkom() {
		System.out.println("Welkom bij "+ naam);
	}
	void setNaam(String naam) {
		this.naam = naam;
	}
	void voegDeelnemersToe() {
		
		System.out.print("Wat is uw naam");
		String deNaam = scanner.next();
		Deelnemer deelnemer = new Deelnemer(deNaam);
		deelnemers.add(deelnemer);
		System.out.println("Wilt u nog iemand aanmelden?\n 1 ja 2 nee");
		int antwoordNogEen = scanner.nextInt();
		if(antwoordNogEen == 1) {
			voegDeelnemersToe();
		}
	}
}
class Deelnemer{
	String naam;
	Deelnemer(String deNaam){
		naam = deNaam;
	}
}













