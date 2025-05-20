//LAB 8
class account{
    static int balance=500;
    public static void deposit(int amt){
        balance+=amt;
        System.out.println(balance);
    }
    public static void withdraw(int amt) throws Exception{
        if(balance-amt>500){
            balance-=amt;
            System.out.println(balance);
        }else{
            throw new Exception("Less balance boii");
        }
    }
}
class Main {
    public static void main(String[] args) {
        account.deposit(500);
        try{
            account.withdraw(400);
            account.withdraw(200);
        }catch (Exception e){
            System.out.println("Excpetion::"+e.getMessage());
        }
    }
}
