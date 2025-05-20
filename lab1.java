//LAB 1A
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the freaking gym");
        System.out.println("Enter your name boi");
        String name=scanner.nextLine();
        System.out.println("Enter your age boi");
        int age=scanner.nextInt();
        System.out.println("duration of membership");
        int fees=scanner.nextInt()*50;
        System.out.println(name + age + fees);
    }
}


//LAB1B

class Main {
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            System.out.println("");
            for(int j=0; j<8; j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
}}
