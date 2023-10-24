public class Passengers {

    private String name;
    private String address;
    private int phoneNumber;
    private int passengerId;

    public Passengers(String name, String address, int phoneNumber, int passengerId){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.passengerId = passengerId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }





}
