import java.sql.SQLOutput;

public class Patient implements Prototype {
    private String name;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public Patient(String name, String phoneNumber) throws InterruptedException {
        System.out.println("Lets pretend the patient creation takes a lot of time....");
        Thread.sleep(3000);

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Patient(Patient patient) {
        this.name = patient.name;
        this.phoneNumber = patient.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', phoneNumber='" + phoneNumber + "'}";
    }

    @Override
    public Prototype clone() {
        return new Patient(this);
    }
}
