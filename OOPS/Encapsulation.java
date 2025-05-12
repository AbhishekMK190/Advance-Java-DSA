package OOPS;

class Test1{
    private int test;

    public void gett(int test){
        this.test = test;
    }

    public int sett(){
        return test;
    }
}

public class Encapsulation {

    public static void main(String[] args){
        Test1 t1 = new Test1();
        t1.gett(10);
        System.out.println(t1.sett());
    }
}
