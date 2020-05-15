// Story Class

public class Story {
    
    private String level0;
    private String level1;
    private String level2;
    private String level3;
    private String level4;


    // Constructors
    public Story(){

        setlevel0("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING THE ROOF!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It all happened so fast. \t\t\t\t***\n"
            + "***\t One minute you were at the beach with your family, \t***\n"
            + "***\t the next minute you're fighting off a horde of zombies,***\n"
            + "***\t trying desperately to stay alive each day. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 1!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");
            
        setlevel1("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING FLOOR 1!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t As the evenings draw in and the temperature drops, \t***\n"
            + "***\t your mind turns toward the ghostly, \t\t\t***\n"
            + "***\t the ghoulish and the gruesome. \t\t\t***\n"
            + "***\t These days it also turns toward the apocalyptic, \t***\n"
            + "***\t with the autumnal return of post-apocalyptic \t\t***\n"
            + "***\t television such as The Strain, The Walking Dead \t***\n"
            + "***\t and iZombie. \t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 2!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setlevel2("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING FLOOR 2!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It all happened so fast. \t\t\t\t***\n"
            + "***\t One minute you were at the beach with your family, \t***\n"
            + "***\t the next minute you're fighting off a horde of zombies,***\n"
            + "***\t trying desperately to stay alive each day. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 3!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setlevel3("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING FLOOR 3!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It all happened so fast. \t\t\t\t***\n"
            + "***\t One minute you were at the beach with your family, \t***\n"
            + "***\t the next minute you're fighting off a horde of zombies,***\n"
            + "***\t trying desperately to stay alive each day. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 4!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setlevel4("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING LEVEL 4!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It all happened so fast. \t\t\t\t***\n"
            + "***\t One minute you were at the beach with your family, \t***\n"
            + "***\t the next minute you're fighting off a horde of zombies,***\n"
            + "***\t trying desperately to stay alive each day. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t ... \t\t\t\t\t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");
    }


    // Getters and Setters
    public String getlevel0() {
        return this.level0;
    }

    public void setlevel0(String level0) {
        this.level0 = level0;
    }

    public String getlevel1() {
        return this.level1;
    }

    public void setlevel1(String level1) {
        this.level1 = level1;
    }

    public String getlevel2() {
        return this.level2;
    }

    public void setlevel2(String level2) {
        this.level2 = level2;
    }

    public String getlevel3() {
        return this.level3;
    }

    public void setlevel3(String level3) {
        this.level3 = level3;
    };

    public String getlevel4() {
        return this.level4;
    }

    public void setlevel4(String level4) {
        this.level4 = level4;
    }

    public static void main(String[] args){

        Story s1 = new Story();

        //System.out.println(s1.getlevel0());
        System.out.println(s1.getlevel1());
        // System.out.println(s1.getlevel2());
        // System.out.println(s1.getlevel3());
        // System.out.println(s1.getlevel4());
    }

}