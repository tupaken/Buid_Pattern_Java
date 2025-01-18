package aufgabe3;

public class Film {
	private final String Titel;
	private final Integer Jahr;
	private final String orignal_Titel;
	private final Integer laufzeit;
	private final Double sternebewertung;
	private final String Datum;
	
	private Film(FilmBuilder builder)   {
		this.Titel=builder.Titel;
		this.Jahr=builder.Jahr;
		this.orignal_Titel = builder.orignal_Titel;
		this.laufzeit = builder.laufzeit;
		this.sternebewertung = builder.sternebewertung;
		this.Datum = builder.Datum;
		
		
	}
	
	public String toString() {
	    return "Film{" +
	            "Titel='" + Titel + '\'' +
	            ", Jahr=" + Jahr +
	            ", orignal_Titel='" + orignal_Titel + '\'' +
	            ", laufzeit=" + laufzeit +
	            ", sternebewertung=" + sternebewertung +
	            ", Datum='" + Datum + '\'' +
	            '}';
	}

	public static class FilmBuilder implements Film_interface {
		private final String Titel;
		private final Integer Jahr;
		private  String orignal_Titel;
		private  Integer laufzeit;
		private  Double sternebewertung;
		private  String Datum;
		
		
		public FilmBuilder (String titel,int Jahr) {
			this.Titel=titel;
			this.Jahr=Jahr;
		}


		@Override
		public FilmBuilder original_Titel(String original_Titel) {
			this.orignal_Titel=original_Titel;
			return this;
		}

		@Override
		public FilmBuilder laufzeit(Integer laufzeit) {
			this.laufzeit=laufzeit;
			return this;
		}

	
		@Override
		public FilmBuilder Datum(String Datum) {
			this.Datum=Datum;
			return this;
		}

		@Override
		public Film Erzeugen() {
			return new Film(this);
		}

		@Override
		public FilmBuilder sternebewertung(Double sternebewertung) {
			this.sternebewertung=sternebewertung;
			return this;
		}

	}
	
}
