package Lab8;

import java.io.Serializable;

public class Record implements Serializable{
	public static final long serialVersionUID = 1L;
	private String artist;
	private String songTitle;
	private String pubYear;
	private double price;
	private long ID;
	public static long count = 123456;
	
	public Record() {
		artist = null;
		songTitle = null;
		pubYear = null;
		price = 0.0;
		ID = count++;
	}
	
	public Record(String artist, String songTitle, String pubYear, double price) {
		this.artist = artist;
		this.songTitle = songTitle;
		this.pubYear = pubYear;
		this.price = price;
		this.ID = count++;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getID() {
		return ID;
	}
	
	public String toString() {
		String output = "Artist: " + artist + "\tTitle: " + songTitle + "\tPublication Year: " + pubYear + "\tPrice: " + price + "\tID: " + ID;
		return output;
	}
	

}
