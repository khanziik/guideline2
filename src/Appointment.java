public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        setDate(date);
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            this.date = date;
        } else {
            System.out.println("The reception date cannot be empty.");
        }
    }
    public void reschedule(String newDate) {
        setDate(newDate);
        System.out.println("The reception has been rescheduled on " + newDate);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + appointmentId +
                ", patient=" + patient.getFullName() +
                ", doctor=" + doctor.getName() +
                ", date='" + date + '\'' +
                '}';
    }
}
