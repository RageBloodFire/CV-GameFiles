// Sorage Class to store scores
package cvirus.util;

import java.io.*;
import java.util.*;

public class Storage {

    public void writeScore(String text, int score) {
        try {
            String data = "";

            File myObj = new File("/home/robert/Desktop/cvirus/util/scores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "\n";

            }

            if (data != "") {
                FileWriter myWriter = new FileWriter("/home/robert/Desktop/cvirus/util/scores.txt");
                String writethis = data + '\n' + text + ":" + score;
                //System.out.println(writethis);
                myWriter.write(writethis);
                myWriter.close();

            } else {
                FileWriter myWriter = new FileWriter("/home/robert/Desktop/cvirus/util/scores.txt");
                String writethis = text + ":" + score;
                //System.out.println(writethis);
                myWriter.write(writethis);
                myWriter.close();

            }
            myReader.close();

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getScores() {
        String data = "";
        try {
            System.out.println("*************\t   Scores \t*******************\n");
            File myObj = new File("/home/robert/Desktop/cvirus/util/scores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "\n";

            }
            System.out.println(data);
            myReader.close();
            System.out.println("***************************************************\n");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    // Testing
    // public static void main(String[] args) {

    //     Storage st = new Storage();

    //     st.writeScore("Roach", 2998);
    //     st.writeScore("Madil", 458);
    //     st.writeScore("Bredda Shark", 908);
    //     System.out.println("\n\n\n");
        
    //     st.getScores();

    // }

}
