import java.util.Scanner;

public class check_positiveEven_positiveOdd_negativeEven_negativeOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();

     if (num>0){
        if (num%2==0){
        System.out.println("Positive Even");
        } else{
        System.out.println("Positive Odd");
        }
     }else if (num<0){

        if (num%2==0){
        System.out.println("Negative Even");
        } else{
        System.out.println("Negative Odd");
        }
     
     }else{
               System.out.println("Zero");
 
     }
    }
}
