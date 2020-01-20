import java.util.Scanner;

public class CollegeCost {
    boolean campus_accomodation;
    int weeks_of_stay;
    double weekly_cost_of_accomodation;
    double weekly_cost_of_sustenance;

    String[] details = new String[4];

    // dorm or commute only modifieas state
    public void dormOrCommute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you living On Campus (N) or Off (F) Campus?");
        switch(sc.nextLine()){
            case "N":
                campus_accomodation = true;
                break;
            case "F":
                campus_accomodation = false;
                break;
            default:
                System.out.println("Invalid input to dormOrCommute function");
        }
    }

    public void durationOfStay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many weeks are you staying in that accomodation?\n");
        try {
            weeks_of_stay = sc.nextInt();   
            if (weeks_of_stay > 52) {
                System.out.println("Please enter 52 if planning to stay for more than a year"+
                "this is a yearly cost calculator");
            }
        } catch(Exception e) {
            System.out.println("Error in accomdation stay time");
        }
    }

    public void costOfAccomodation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much does your accomodation cost per week (2 d.p.)?");
        try {
            weekly_cost_of_accomodation = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error in weekly accomodation cost");
        }
    }

    public void costOfSustenance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much will sustenance cost per week (2.d.p)?\n");
        try {
            weekly_cost_of_sustenance = sc.nextDouble();
        } catch(Exception e) {
            System.out.println("Error in costOfSustenance method");
        }
    }

    public void getPersonalDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Age, Degree Type (e.g. MSc, BA, PhD),Year of Study");
        for (int i=0; i<4; i++){
            details[i] = sc.nextLine();
        }
    }

    public static void main(String[] args){
        CollegeCost Cost = new CollegeCost();
        Cost.dormOrCommute();
        Cost.durationOfStay();
        Cost.costOfAccomodation();
        Cost.costOfSustenance();
        Cost.getPersonalDetails();
    }
}