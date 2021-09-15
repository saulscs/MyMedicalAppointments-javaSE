package Model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient Patient;
    private Doctor Doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Model.Patient patient, Model.Doctor doctor) {
        Doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Model.Patient getPatient() {
        return Patient;
    }

    public void setPatient(Model.Patient patient) {
        Patient = patient;
    }

    public Model.Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(Model.Doctor doctor) {
        Doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
