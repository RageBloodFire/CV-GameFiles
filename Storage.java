// Sorage Class to store scores
import java.io.*;
import java.util.*;

public class Storage {
    
    public void writescore(String name, int score) {
        try 
        {
            FileWriter myWriter = new FileWriter("scores.txt");
            myWriter.write(name + ":" + score);
            myWriter.close();
        } catch (FileNotFoundException e) {

            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void getScores() {
		try 
        {
            System.out.println("*************\t   Scores \t*****************\n");
            File myObj = new File("scores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("***\t\t\t" + data + "\t\t\t***\n");
            }
            myReader.close();
            System.out.println("******************************\n");
        }

		catch (FileNotFoundException e) 
		{
			
			System.out.println("File not found");
		}
	
    }
    
    public static void main(String[] args){

        
    }

}