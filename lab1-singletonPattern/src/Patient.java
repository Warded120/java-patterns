public class Patient {
    private String name;
    private String phoneNumber;

    public Patient(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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
}
