// Story Class

public class Story {
    
    private String level0;
    private String level1;
    private String level2;
    private String level3;
    private String level4;
    private String end;
    private String endBad;
    private String endGood;


    // Constructors
    public Story(){

        setlevel0("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING THE ROOF!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It all happened so fast. \t\t\t\t***\n"
            + "***\t One minute you were at the beach with your family, \t***\n"
            + "***\t the next minute you're fighting off a horde of zombies,***\n"
            + "***\t trying desperately to stay alive each day. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t Unsure why, you're slightly worried about your wife \t***\n"
            + "***\t and two daughters back at the safe house. \t\t***\n"
            + "***\t But this isn't the time to be worried, \t\t***\n"
            + "***\t you have to make it out of here alive first. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 1!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");
            
        setlevel1("\n*******************************************************************\n"
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

        setlevel2("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING FLOOR 2!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You remembered it so vividly as if it happend \t\t***\n"
            + "***\t yesterday. \t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t Your parents were killed on the first day of the \t***\n"
            + "***\t outbreak, only to be revitalised into sentient zombies ***\n"
            + "***\t who must subsist on a diet of grey matter in order to \t***\n"
            + "***\t maintain any link to humanity. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t The image of their festering, slightly decomposed \t***\n"
            + "***\t bodies taking on total different personas, \t\t***\n"
            + "***\t will unfortunately be burnt into your mind. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 3!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setlevel3("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING FLOOR 3!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t \"No one ever listens to me. \t\t\t\t***\n"
            + "***\t I told them it would be too dangerous to search this \t***\n"
            + "***\t area, but noooooo. \t\t\t\t\t***\n"
            + "***\t Its like they're having an award for 'Best Scavenger' \t***\n"
            + "***\t ... or bravest idiot.\" \t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t Now look where you are, fighting to stay alive, \t***\n"
            + "***\t because of their misjudgement. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t YOU ARE NOW ENTERING FLOOR 4!... \t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setlevel4("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t LEAVING LEVEL 4!... \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t It's like if they eat brains, \t\t\t\t***\n"
            + "***\t they retain their own identity but also inherit \t***\n"
            + "***\t the memories and personality of the brains \t\t***\n"
            + "***\t they have eaten. \t\t\t\t\t***\n"
            + "***\t It's a gruesome sight nonetheless. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t Let's hurry up and go home. \t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t ... \t\t\t\t\t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setEnd("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t Finally you made it out of the hotel, \t\t\t***\n"
            + "***\t after hours of constantly killing and hiding. \t\t***\n"
            + "***\t But something feels off... \t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You start to make your way towards the safehouse. \t***\n"
            + "***\t Piles of flesh eater corpses layer the streets. \t***\n"
            + "***\t As you come closer to the safehouse there is a  \t***\n"
            + "***\t strong burning flesh scent in the air. \t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You see thick black smoke \t\t\t\t***\n"
            + "***\t cominig from where the safehouse is located.... \t***\n"
            + "***\t You started running,  \t\t\t\t\t***\n"
            + "***\t then you make a left towards the safehouse.\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n");

        setEndBad("***\t\t\t\t\t\t\t\t***\n"
            + "***\t You can't believe what you see. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t The safehouse... It's... It's on fire!! \t\t***\n"
            + "***\t \"How... HOW DID THIS HAPPEN?? \t\t\t\t***\n"
            + "***\t Where is everyone? Are they inside? Did they flee??\" \t***\n"
            + "***\t .... \t\t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You then catch a glimpse of your daughter's toy doll, \t***\n"
            + "***\t half molten and still burning beside a pile of rubble. ***\n"
            + "***\t You felt your heart skip several beats, \t\t***\n"
            + "***\t it was as if time froze... The pain... The anger... \t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t THE PAIN... \t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
            + "*******************************************************************\n\n");

        setEndGood("***\t\t\t\t\t\t\t\t***\n"
            + "***\t You can't believe what you see. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t There's a pile of zombie corpses \t\t\t***\n"
            + "***\t burning in front of the safehouse. \t\t\t***\n"
            + "***\t \"How did this happen?\" \t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t As you walk towards the entrance, the door opens. \t***\n"
            + "***\t Your wife and daughters run to great you. \t\t***\n"
            + "***\t You're filled with joy and relief, \t\t\t***\n"
            + "***\t as you were expecting the worst. \t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t \"let's go inside.\" \t\t\t\t\t***\n" 
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

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEndBad() {
        return this.endBad;
    }

    public void setEndBad(String endBad) {
        this.endBad = endBad;
    }

    public String getEndGood() {
        return this.endGood;
    }

    public void setEndGood(String endGood) {
        this.endGood = endGood;
    }


    //Testing area
    public static void main(String[] args){

        Story s1 = new Story();

        System.out.println(s1.getlevel0());
        System.out.println(s1.getlevel1());
        System.out.println(s1.getlevel2());
        System.out.println(s1.getlevel3());
        System.out.println(s1.getlevel4());
        System.out.println(s1.getEnd());
        System.out.println(s1.getEndBad());
        System.out.println(s1.getEndGood());
    }

}