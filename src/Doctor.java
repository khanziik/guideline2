public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private int experienceYears;

    // Конструктор
    public Doctor(int doctorId, String name, String specialization, int experienceYears) {
        this.doctorId = doctorId;
        setName(name);
        this.specialization = specialization;
        setExperienceYears(experienceYears);
    }

    // Getters
    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Setters withvalidations
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Имя врача не может быть пустым.");
        }
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        } else {
            System.out.println("Warning: work experience years cannot be negative.");
            this.experienceYears = 0;
        }
    }
    public boolean canPerformSurgery() {
        return specialization.equalsIgnoreCase("Surgery")
                || specialization.equalsIgnoreCase("Cardiology");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + doctorId +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
