import java.util.Date;
import static Ui.UIMenu.*;

class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

        patient.setPhoneNumber("12345678");
        
        System.out.println(patient.getPhoneNumber());

    }
}