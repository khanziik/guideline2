public class Main {
    public static void main(String[] args) {

        System.out.println("Hospital Management System\n");
        Patient p1 = new Patient(1, "Suleimen Khanzere", 17, "O+");
        Patient p2 = new Patient();

        Doctor d1 = new Doctor(101, "Dr. Isa", "Cardiology", 12);
        Doctor d2 = new Doctor();

        Appointment a1 = new Appointment(1001, "Suleimen Khanzere", "Dr. Isa", "2025-05-20");

        System.out.println("PATIENTS");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nDOCTORS");
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("\nAPPOINTMENTS");
        System.out.println(a1);

        System.out.println("\nTESTING METHODS");
        System.out.println("Is patient minor? " + p1.isMinor());
        System.out.println("Doctor can perform surgery: " + d1.canPerformSurgery());

        a1.reschedule("2025-05-25");
        System.out.println("Rescheduled appointment: " + a1);

        System.out.println("\nProgram Complete");
    }
}