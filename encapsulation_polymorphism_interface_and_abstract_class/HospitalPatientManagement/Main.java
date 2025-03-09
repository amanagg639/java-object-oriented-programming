package encapsulation_polymorphism_interface_and_abstract_class.HospitalPatientManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("John", 18);
        OutPatient p2 = new OutPatient("Jane", 18);

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.calculateBill();
            p.addRecord();
            p.viewRecord();
        }
    }
}
