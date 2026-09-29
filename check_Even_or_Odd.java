import java.util.Scanner;
public class  check_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}