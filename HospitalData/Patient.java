package HospitalData;

import javax.imageio.stream.ImageInputStream;

public class Patient {
    String patientName , Date_Of_Arrival , Disease;
    int patientAge;

    public Patient(String patientName, int patientAge, String date_Of_Arrival, String disease,Information info,Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        Disease = disease;
        Date_Of_Arrival = date_Of_Arrival;
        this.info = info;
        this.pay = pay;
    }
    Information info;

    Payment pay;

    public void patient_Details(){
        System.out.println("The details of the patient are:");
        System.out.println("--------------------------------");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: "+ this.patientAge);
        System.out.println("Date of Arrival: "+ this.Date_Of_Arrival);
        System.out.println("Disease: "+ this.Disease);
        System.out.println("Block Number: "+ this.info.blockNo);
        System.out.println("Floor Number: "+ this.info.floorNo);
        System.out.println("Room Number: "+ this.info.roomNo);
        System.out.println("Bed Number: "+ this.info.bedNo);
        System.out.println("Admission Fees: "+ this.pay.admFees);
        System.out.println("Registration fees: "+ this.pay.regFees);
        System.out.println("Balance Amount: "+ this.pay.balAmount);
    }

    public static void main(String[] args) {

        Information i1 = new Information(10,3,32,12);
        Payment pay1 = new Payment(12000,2000,40000);
        Patient p1 = new Patient("Test1" , 21,"10/12/2024" ,"Jaundice" , i1,pay1);

        p1.patient_Details();

    }

}
