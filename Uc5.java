import java.util.Scanner;

public class Uc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uc5 obj=new Uc5();
        System.out.println("Enter the number of rows");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
