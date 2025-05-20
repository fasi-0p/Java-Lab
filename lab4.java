//LAB4a
import java.util.Scanner;
enum Day{
    sunday, monday, tuesday, wednesday, thursday, friday, saturday}


class Main {
    public static void weekday(Day day){
        if(day==Day.sunday || day==Day.saturday){
            System.out.println("Its a weekend");
        }else{
            System.out.println("Its a weekday");
        }
    }
    public static void main(String[] args) {
        Main obj= new Main();
        Day sun= Day.sunday;
        obj.weekday(sun);
    }
}


//LAB 4B
import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> llist= new ArrayList<>();
        for (int i=0; i<=4;i++){
            System.out.println("Enter student marks");
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            llist.add(x);
        }
        int sum=0;
        float avg=0;
        for (int i=0; i<llist.size(); i++){
            sum=sum+llist.get(i);
        }
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+ sum/llist.size());
    }
}
