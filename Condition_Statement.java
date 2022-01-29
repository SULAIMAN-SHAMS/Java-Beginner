import java.util.*;
public class Condition_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 50){
            System.out.print("OVERAGE, NOT ELIGIBLE");
        }
        else if (age == 50){
            System.out.print("ELIGIBLE");
        }
        else {
            System.out.print("ELIGIBLE");
        }

        
    }
    
}
