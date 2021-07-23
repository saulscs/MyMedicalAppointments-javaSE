import static Ui.UIMenu.*;

class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());


    }
}