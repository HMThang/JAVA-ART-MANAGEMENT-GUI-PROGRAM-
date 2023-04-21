package FIT;

import java.util.ArrayList;
import java.util.List;

public abstract class ArtObject {
	protected String title;
	protected String artist;
	protected int year;
	public List<Painting> lstPainting = new ArrayList<Painting>();
	public List<Sclupture> lstSculpture = new ArrayList<Sclupture>();

	public ArtObject() {
		createPaintingList();
	}

	public ArtObject(String title, String artist, int year) {
		super();
		this.artist = artist;
		this.title = title;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void createPaintingList() {
		lstPainting.add(new Painting("The Annuciation", "Leonardo Da Vinci", 1473, "Sơn dầu", "Hiện đại"));
		lstPainting.add(new Painting("The Baptism of Christ", "Leonardo Da Vinci", 1476, "Sơn dầu", "Cổ điển"));
		lstPainting.add(new Painting("Madonna of the Carnation", "Leonardo Da Vinci", 1473, "Sơn dầu", "Hiện đại"));
		lstPainting.add(new Painting("Text of the original cherry", "Vincent Vangogh", 0, "Sơn dầu", "Cổ điển"));
		lstPainting.add(new Painting("Botero beat oil painting", "Fernando Botero", 0, "Sơn dầu", "Cổ điển"));
	}

	public void createSculpture() {
		lstSculpture.add(new Sclupture("Mustangs", "Robert Glen", 1873, "đá", 50, 60));
		lstSculpture.add(new Sclupture("Expansion", "Paige Bradley", 1873, "thạch cao", 100, 60));
		lstSculpture.add(new Sclupture("People Of the River", "Chong Fah Cheong", 1873, "đá", 70, 60));
		lstSculpture.add(new Sclupture("The Shoes On The Danube Bank", "Can Togay & Gyula Pauer", 1873, "đá", 60, 60));
	}

	public static void main(String[] args) {
		ArtObject artObject = new ArtObject() {
		};
		artObject.createPaintingList();
		artObject.createSculpture();
		for (Painting painting : artObject.lstPainting) {
			System.out.println(painting);
		}
		System.out.println("--------------------------------------------");
		for (Sclupture sclupture : artObject.lstSculpture) {
			System.out.println(sclupture);
		}
	}
}
