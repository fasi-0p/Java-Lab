//LAB 7import java.util.ArrayList;
class Pharmacy{
    int id;
    String name;
    int quantity;
    int price;
    public Pharmacy(int id, String name, int quantity, int price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }}
class Pharmacymanager{
    ArrayList<Pharmacy> llist=new ArrayList<>();
    public void add(Pharmacy item){
        llist.add(item);
    }
    public void remove(int id){
        for(int i=0;i<llist.size();i++){
            Pharmacy p=llist.get(i);
            if(p.id==id){
                llist.remove(i);
                break;
            }
        }
    }
    public void update(int id, int quantity){
        for(int i=0;i<llist.size(); i++){
            Pharmacy p=llist.get(i);
            if(p.id==id){
                p.quantity=quantity;
            }
        }
    }
    public void display(){
        for(int i=0;i<llist.size();i++){
            Pharmacy p=llist.get(i);
            System.out.println(p.id+" "+p.name+" "+p.quantity+" "+p.price);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Pharmacymanager obj=new Pharmacymanager();
        obj.add(new Pharmacy(10,"crocin", 100, 2));
        obj.add(new Pharmacy(11,"dolo 650", 100, 3));
        obj.add(new Pharmacy(12,"crocin", 100, 5));
        obj.display();
        
    }
}
