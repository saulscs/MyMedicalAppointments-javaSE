import Model.Doctor;
import Model.ISchedulable;
import Model.Patient;
import Model.User;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new String(),"4pm");
        myDoctor.addAvailableAppointment(new String(), "1pm");
        myDoctor.addAvailableAppointment(new String(), "10pm");

        System.out.println(myDoctor.getAvailableAppointments());

        User user = new Doctor("Saul", "saul@gmail.com");
        user.showDataUser();

        User paciente = new Patient("lp", "lp@gmail.com");
        paciente.showDataUser();


        //Clase anonima
        User user1 = new User("Saul", "saul@info.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Angeles");
                System.out.println("Departamento: ZZZZ");
            }
        };

        user1.showDataUser();



        /*for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
       System.out.println(patient);*/
    }
}