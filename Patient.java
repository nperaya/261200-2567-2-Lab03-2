public class Patient {

    //Fields
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {

        this.id = id;
        this.name = name;

        // เช็คปีเกิด
        if (birthYear > 0) {
            this.birthYear = birthYear;
        }

        // เช็คส่วนสูง
        if (height > 0) {
            this.height = height;
        }

        // เช็คน้ำหนัก
        if (weight > 0) {
            this.weight = weight;
        }

        if (bloodGroup != null && !bloodGroup.isEmpty()) {
            this.bloodGroup = bloodGroup;
        } else {
            this.bloodGroup = "Unknown";
        }

        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "Unknown";
        }
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // คำนวณอายุ

    public int getAge(int currentYear) {
        if (currentYear >= birthYear && birthYear > 0) {
            return currentYear - birthYear;
        } else {
            System.out.println("Invalid current year for patient: " + name);
            return 0;
        }
    }

    //คำนวณ BMI
    public double getBMI() {
        if (height > 0 && weight > 0) {
            double heightInMeter = height / 100.0;
            return weight / (heightInMeter * heightInMeter);
        }
        return 0;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);

        if (birthYear > 0) {
            System.out.println("Patient Age: " + getAge(currentYear));
        } else {
            System.out.println("Invalid birth year for patient: " + name);
        }
        if (height > 0) {
            System.out.println("Patient Height (cm): " + height);
        } else {
            System.out.println("Patient Height (cm): Invalid height for patient: ");
        }

        if (weight > 0) {
            System.out.println("Patient Weight (kg): " + weight);
        } else {
            System.out.println("Patient Weight (kg): Invalid weight for patient: ");
        }

        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("BMI: " + getBMI());

        System.out.println("---------------------------");
    }

}
