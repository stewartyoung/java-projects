import java.util.Scanner;

public class CollegeCost {
    public boolean campus_accomodation;

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
    public static void main(String[] args){
        CollegeCost Cost = new CollegeCost();
        Cost.dormOrCommute();

    }
}