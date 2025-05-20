//LAB 9 
import java.util.ArrayList;
interface StackOperation{
    void push(int num);
    void pop();
    void display();
}

class Staticstack implements StackOperation{
    ArrayList<Integer> stack=new ArrayList();
    int size=3;
    int ptr=0;
    public void push(int num){
        if(ptr==size){
            System.out.println("Stack overflow");
        }else{
            stack.add(num);
            ptr+=0;
        }
    }
    public void pop(){
        if(ptr==0){
            System.out.println("Stack Underflow");
        }else{
            stack.remove(stack.size()-1);
        }
    }
    public void display(){
        for(int i=0;i<stack.size(); i++){
            System.out.println(stack.get(i));
        }
    }
}
class Dynamicstack implements StackOperation{
    ArrayList stack=new ArrayList();
    public void push(int num){
        stack.add(num);
    }
    public void pop(){
        stack.remove(stack.size()-1);
    }
    public void display(){
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
}
class Main {
    public static void main(String[] args) {
        Staticstack obj1=new Staticstack();
        obj1.push(10);
        obj1.push(20);
        obj1.pop();
        obj1.display();
        Dynamicstack obj2=new Dynamicstack();
        obj2.push(10);
        obj2.push(20);
        obj2.pop();
        obj2.display();
    }
}
