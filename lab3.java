//LAB3a
import java.util.Scanner;
class Main {
    public void compare(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
    public void concatenate(String str1, String str2){
        System.out.println(str1+" "+str2);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter str1");
        String str1=scanner.nextLine();
        System.out.println("Enter str2");
        String str2=scanner.nextLine();
        
        Main obj= new Main();
        obj.compare(str1, str2);
        obj.concatenate(str1, str2);
    }
}

//LAB 3B
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        System.out.println(a.capacity());
        
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        input=input.toUpperCase();
        StringBuffer b=new StringBuffer(input);
        b=b.reverse();
        System.out.println(b);
        
        String d=scanner.nextLine();
        System.out.println(d+b);
    }
}
