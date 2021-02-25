package java;

public class Car {
    private Integer id;
    private String licence;
    private Account driver;
    private Integer passengeger;

    public Car(String license, Account driver){
        this.licence = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + licence + "Name Driver: " + driver.name);
    }

        public Integer getPassenger(){
            return passengeger;
        }
        public void setPassenger(Integer passenger)
        if(passenger == 4){
            this.passengeger = passenger;
        }else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }

        
}

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLicence() {
            return licence;
        }

        public void setLicence(String licence) {
            this.licence = licence;
        }

        public Account getDriver() {
            return driver;
        }

        public void setDriver(Account driver) {
			this.driver = driver;
		}
