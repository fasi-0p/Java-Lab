//LAB 5
import java.util.Vector;
class Shopping{
    String name;
    int price;
    String category;
    public Shopping(String name, int price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
}
class Shoppingmanager{
    Vector<Shopping> llist=new Vector<>();
    public void add(Shopping item){
        llist.add(item);
    }
    public void display(){
        for(int i=0; i<llist.size(); i++){
            Shopping s=llist.get(i);
            System.out.println(s.name+s.price+s.category);
        }
    }
    public void remove(String name){
        for(int i=0; i<llist.size();i++){
            Shopping s=llist.get(i);
            if(s.name==name){
                llist.remove(llist.get(i));
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        Shoppingmanager obj=new Shoppingmanager();
        obj.add(new Shopping("Candy", 20, "Snacks"));
        obj.add(new Shopping("Lays", 30, "Snacks"));
        obj.add(new Shopping("Crocin", 5, "Medical"));
        obj.remove("Lays");
        obj.display();
    }
}
