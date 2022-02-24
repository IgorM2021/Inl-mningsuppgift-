import java.sql.SQLOutput;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Om du vill Morse till Eng tryck 1 eller 2 om du vill Eng till Morse.");
        int x = scan.nextInt();
        scan.nextLine();
        System.out.println("Skriva text med stora alphabet bokstäver eller morse kod: ");
        String s = scan.nextLine();

        try {
            if ( x ==1){
                System.out.println(morsekod.getFullString(s));
            }else if (x==2){
                System.out.println(morsekod.getFullMorse(s));
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong symbols used!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("ERROR");
        }

    }


}
