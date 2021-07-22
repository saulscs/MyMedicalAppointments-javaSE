import static Ui.UIMenu.*;

class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahi", "General");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}