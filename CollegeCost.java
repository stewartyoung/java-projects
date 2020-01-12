import java.util.Scanner;

public class CollegeCost {
    boolean campus_accomodation;
    int weeks_of_stay;
    double weekly_cost_of_accomodation;

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

    public static void main(String[] args){
        CollegeCost Cost = new CollegeCost();
        Cost.dormOrCommute();
        Cost.durationOfStay();
        Cost.costOfAccomodation();
    }
}