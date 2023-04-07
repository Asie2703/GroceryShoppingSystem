package domain;
/**
 * POJO Class Driver
 * Name: Gilberto Silva
 * Student: 218239300
 */
public class Driver {
    private int driver_ID;
    private String first_Name;
    private String last_Name;
    private int driver_License_Number;
    private String vehicle_Information;
    private int phone_Number;
    private String email;

    public Driver() {
    }

    public Driver(int driver_ID) {
        this.driver_ID = driver_ID;
    }

    public Driver(int driver_ID, String first_Name, String last_Name, int driver_License_Number, String vehicle_Information, int phone_Number, String email) {
        this.driver_ID = driver_ID;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.driver_License_Number = driver_License_Number;
        this.vehicle_Information = vehicle_Information;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    //------------Getters--------------
    public int getDriver_ID() {return driver_ID;}

    public void setDriver_ID(int driver_ID) {this.driver_ID = driver_ID;}

    public String getFirst_Name() {return first_Name;}

    public void setFirst_Name(String first_Name) {this.first_Name = first_Name;}

    public String getLast_Name() {return last_Name;}

    //------------Setters--------------
    public void setLast_Name(String last_Name) {this.last_Name = last_Name;}

    public int getDriver_License_Number() {return driver_License_Number;}

    public void setDriver_License_Number(int driver_License_Number) {this.driver_License_Number = driver_License_Number;}

    public String getVehicle_Information() {return vehicle_Information;}

    public void setVehicle_Information(String vehicle_Information) {this.vehicle_Information = vehicle_Information;}

    public int getPhone_Number() {return phone_Number;}

    public void setPhone_Number(int phone_Number) {this.phone_Number = phone_Number;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Driver{" +
                "driver_ID=" + driver_ID +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", driver_License_Number=" + driver_License_Number +
                ", vehicle_Information='" + vehicle_Information + '\'' +
                ", phone_Number=" + phone_Number +
                ", email='" + email + '\'' +
                '}';
    }

}
