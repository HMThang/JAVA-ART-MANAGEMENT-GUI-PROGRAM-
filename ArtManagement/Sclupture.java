package FIT;

public class Sclupture extends ArtObject {
	private String materialFrom;
	private int height;
	private int weight;

	public Sclupture(String title, String artist, int year, String materialFrom, int height, int weight) {
		super(title, artist, year);
		this.materialFrom = materialFrom;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		return title + "\t" + artist + "\t" + year + "\t" + materialFrom + "\t" + height + "\t" + weight;
	}

}
