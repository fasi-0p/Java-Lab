//LAB 6
import java.util.ArrayList;
class Queue<T>{
    ArrayLista<T> llist=new ArrayList();
    int size=3;
    int ptr=0;
    public void enqueue(T item){
        if(ptr==size){
            size=size*2;
        }
        llist.add(item);
        ptr+=1;
    }
    public void dequeue(){
        if(ptr==0){
            System.out.println("Its empty");
        }else{
            llist.remove(0);
            ptr-=1;
        }
    }
    public void display(){
        for(int i=0; i<llist.size(); i++){
            System.out.println(llist.get(i));
        }
    }
}
class Main {
    public static void main(String[] args) {
       Queue obj=new Queue();
       obj.enqueue(10);
       obj.enqueue("meow");
       obj.enqueue(30);
       obj.display();
    }
}
