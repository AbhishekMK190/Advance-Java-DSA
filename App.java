import MyPackage.*;

public class App {
    public static void main(String[] args){
        SBI sb = new SBI();
        Kotak kt = new Kotak();
        HDFC hc = new HDFC();

        System.out.println("Rate of interest of SBI is: "+sb.RateOfInterest());

        System.out.println("Rate of interest of Kotak is: "+kt.RateOfInterest());

        System.out.println("Rate of interest of HDFC is: "+hc.RateOfInterest());
    }
}
