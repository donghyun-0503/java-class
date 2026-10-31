package test2;

public class Song {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void showInfo() {
        System.out.println(title + " - " + artist);
    }
}
