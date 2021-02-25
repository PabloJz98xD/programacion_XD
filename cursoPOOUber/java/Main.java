package java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo XD");
        // Car car = new Car("AMQ123", new Account("Pablo Zuniga","AND123"));
        // car.passengeger = 4;
        // car.printDataCar();

        // Car car2 = new Car("ALS1234", new Account("Juan", "XD"));
        // car2.passengeger = 2;
        // car2.printDataCar();
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(2);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }    
}
