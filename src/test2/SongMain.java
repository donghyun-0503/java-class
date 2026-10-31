package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class SongMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Song> playlist = new ArrayList<Song>();

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String title = scanner.next();
            String artist = scanner.next();

            Song song = new Song(title, artist);

            playlist.add(song);
        }

        for (Song song : playlist) {
            song.showInfo();
        }

        System.out.println("총 " + playlist.size() + "곡");
    }
}
