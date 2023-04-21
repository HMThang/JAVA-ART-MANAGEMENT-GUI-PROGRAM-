package FIT;

public class Painting extends ArtObject {
	private String paintType;
	private String style;

	public Painting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Painting(String title, String artist, int year, String paintType, String style) {
		super(title, artist, year);
		this.paintType = paintType;
		this.style = style;

	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTile() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setArtist(String artist)
	{
		this.artist=artist;
	}
	public String getArtist()
	{
		return this.artist;
	}
	public String toString() {
		return title + "\t" + artist + "\t" + year + "\t" + paintType + "\t" + style + "\t";
	}
}
