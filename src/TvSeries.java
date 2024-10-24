import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries {

        private String name;
        private ArrayList<Integer> episodes = new ArrayList<>();
        private int rating;


        public TvSeries(String inName) {
        Scanner myScan = new Scanner(System.in);
            System.out.println("Please enter the name of the tv series: ");
            name = myScan.nextLine();
        }

        public void AddEpisodes(int numOfEpisodes, int seasons) {

        }

        public void ChangeRating(int NewRating) {

        }

        public void PrintInfo() {

        }


    }

