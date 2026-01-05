public class Patient {

    private int patientId;
    private String fullName;
    private int age;
    private String bloodType;

    // Constructor with parameters
    public Patient(int patientId, String fullName, int age, String bloodType) {
        this.patientId = patientId;
        setFullName(fullName);
        setAge(age);
        this.bloodType = bloodType;
    }

    // Default constructor
    public Patient() {
        this.patientId = 0;
        this.fullName = "Unknown";
        this.age = 0;
        this.bloodType = "Unknown";
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    // Setters with validation
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
        } else {
            System.out.println("Warning: Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Warning: Age cannot be negative.");
            this.age = 0;
        }
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Additional methods
    public boolean isMinor() {
        return age < 18;
    }

    public String getAgeCategory() {
        return age < 18 ? "Minor" : "Adult";
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + patientId +
                ", name='" + fullName + '\'' +
                ", age=" + age +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}