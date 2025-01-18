package aufgabe3;

public class Main {

	public static void main(String[] args) {
		Film film= new Film.FilmBuilder("Test",2025).Datum("18.01.2025").laufzeit(123).Erzeugen();
		System.out.println(film);
	}

}
