public interface I1{
	public int A_B=2;
    public void method1() ;
    public void method2();
    public void method3();
    
}


interface I2 {

    public void method4();
    public void method5();
}


interface I3 extends I1,I2{
    public void method2();
   
    
}

class Demo5 implements I3 {

    

    @Override
    public void method4() {
        // TODO Auto-generated method stub
        System.out.println("hello from method4");
    }

    @Override
    public void method5() {
        // TODO Auto-generated method stub
        System.out.println("hello from method 5");
        
    }

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("hello from method 1");
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("hello from method 2");
    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub
        System.out.println("hello from method3");
    }
    
    
    public static void main(String[] args) {
         I3 i1 = new Demo5();
         
        
    }
}
 


//if we are trying to overload override method by changing the sign then it wont allow,we can resolve by changing arg
