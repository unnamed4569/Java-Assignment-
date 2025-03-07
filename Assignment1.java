public class Assignment1{
    int a=10;
    int b=30;
    public void display1(){
        System.out.println("a = " + a);
    }
    public void display2(){
        System.out.println("b= " + b);
    }
    
    public static  void main(String args[]){
        Assignment1 obj = new Assignment1();
          obj.display1();
          obj.display2();
    }
}