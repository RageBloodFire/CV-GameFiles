//Menu Class
import java.util.*;

public class Menu{

    private Scanner scan = new Scanner(System.in);
    private String x;


    //Methods
    public boolean advanceMenu(){
        System.out.println("\n\t Advance To Next Floor \t(a)");

        x = scan.nextLine();
        if(x.equalsIgnoreCase("a")){
            return true;
        }

        System.out.println("\nInvalid Option!");
        return false;

    }

    public String fightMenu(){
        System.out.println("\n\t Fight Enemy \t\t(f)");
        System.out.println("\t Use Item \t\t(e)");

        x = scan.nextLine();

        if(x.equalsIgnoreCase("f")){
            return "fight";
        }
        else if(x.equalsIgnoreCase("e")){
            return itemMenu();
        }
        else{
            System.out.println("\nInvalid Option!");
            return "wrong";
        }
    }

    public String itemMenu(){
        System.out.println("\n\t Use Medkit \t\t(1)");
        System.out.println("\t Use Energy Drink \t(2)");

        x = scan.nextLine();

        if(x.equalsIgnoreCase("1")){
            return "medkit";
        }
        else if(x.equalsIgnoreCase("2")){
            return "drink";
        }
        System.out.println("\nInvalid Option!");
        return "err";
    }

    public String nextMenu(){
        System.out.println("\n\t Advance to Next Floor \t(a)");
        System.out.println("\t Use Item \t\t(e)");

        x = scan.nextLine();

        if(x.equalsIgnoreCase("a")){
            return "adv";
        }
        else if(x.equalsIgnoreCase("e")){
            return itemMenu();
        }
        System.out.println("\nInvalid Option!");
        return "wrong";
    }


    //Testing 
    // public static void main(String[] agrs){

    //     Menu menu = new Menu();

    //     System.out.println(menu.advanceMenu());
    //     System.out.println(menu.fightMenu());
    //     System.out.println(menu.nextMenu());

    // }

}