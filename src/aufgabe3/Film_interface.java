package aufgabe3;

import aufgabe3.Film.FilmBuilder;

public interface Film_interface {
	public FilmBuilder original_Titel(String original_Titel);
	public FilmBuilder laufzeit(Integer laufzeit);
	public FilmBuilder Datum(String Datum);
	public Film Erzeugen();
	public FilmBuilder sternebewertung(Double sternebewertung);

}
