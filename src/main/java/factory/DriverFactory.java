package factory;

/**
 * DriverFactory.java
 * @author: Gilberto Silva (218239300)
 * Date: 08 April 2023
 */
import domain.Driver;
import util.Helper;

public class DriverFactory {
    public static Driver createDriver (String driver_ID, String first_Name, String last_Name, int driver_License_Number, String vehicle_Information, long phone_Number, String email){

        if (Helper.isNullorEmpty(first_Name) || Helper.isNullorEmpty(email))
            return null;
        ;
        String driver_NumGen = Helper.generateId();
        Driver driver = new Driver.Builder().setDriver_ID(driver_ID)
                .setFirst_Name(first_Name)
                .setLast_Name(last_Name)
                .setDriver_License_Number(driver_License_Number)
                .setVehicle_Information(vehicle_Information)
                .setPhone_Number(phone_Number)
                .setEmail(email)
                .build();
        return driver;
    }
}
