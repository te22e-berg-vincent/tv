import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries {

    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;


    public TvSeries() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the name of the tv series: ");
        name = myScan.nextLine();
    }

    public TvSeries(String inName) {
        name = inName;
    }

    public void AddEpisodes(int numOfEpisodes, int season) {
        if (season > episodes.size()) {
            for (int i = 0; i < season - 1; i++) {
                episodes.add(0);
            }
        }
        episodes.add(season - 1, numOfEpisodes);
    }

    public void ChangeRating(int newRating) {
        rating = newRating;
    }

    public void PrintInfo() {
        System.out.println("Name: " + name +",reating"+ rating);
    }


}

