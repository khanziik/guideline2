public class Appointment {

    private int appointmentId;
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(int appointmentId, String patientName, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    public Appointment() {
        this.appointmentId = 0;
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.date = "Not set";
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void reschedule(String newDate) {
        this.date = newDate;
    }

    public void cancel() {
        this.date = "Cancelled";
    }

    @Override
    public String toString() {
        return "Appointment{appointmentId=" + appointmentId +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}