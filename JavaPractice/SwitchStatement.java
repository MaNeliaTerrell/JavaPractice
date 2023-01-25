package JavaPractice;
import java.util.Scanner;
public class SwitchStatement{
    public static void main(String[] args) {
       
        // char grade = 'B';

        // switch(grade){
        //     case 'A':
        //         System.out.println("Outstanding");
        //         break;
            
        //     case 'B':
        //         System.out.println("Excellent");
        //         break;
            
        //     case 'C':
        //         System.out.println("Satisfactory");
        //         break;
            
        //     default:
        //         System.out.println("Invalid Grade");

        // }

            Scanner s = new Scanner(System.in);

            System.out.print("Month: ");
            int month = s.nextInt();

            System.out.print("Date: ");
            int date = s.nextInt();

            System.out.print("Year: ");
            int year = s.nextInt();

            s.close();

            String monthWord = "";

            switch(month) {

                case 1:
                    monthWord = "January";
                    break;
                case 2:
                    monthWord = "February";
                    break;
                case 3:
                    monthWord = "March";
                    break;
                case 4:
                    monthWord = "April";
                    break;
                case 5:
                    monthWord = "May";
                    break;
                case 6:
                    monthWord = "June";
                    break;
                case 7:
                    monthWord = "July";
                    break;
                case 8:
                    monthWord = "August";
                    break;
                case 9:
                    monthWord = "September";
                    break;
                case 10:
                    monthWord = "October";
                    break;
                case 11:
                    monthWord = "November";
                    break;
                case 12:
                    monthWord = "December";
                    break;
                default:
                
            }
            System.out.println();

            if(monthWord == "") {
                System.out.println("Month is Invalid");

            }else {
                if(date > 31 || date <=0) System.out.println("Invalid Date");
                else System.out.println(monthWord + " " + date + ", " + year);
            }
    

    }
}


