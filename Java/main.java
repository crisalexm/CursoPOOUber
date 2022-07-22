class main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123", "andres@java.com", "1234"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andrés Herrera", "AND123", "andres@java.com", "1234"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        /* Car car2 = new Car("QWE567", new Account("Andrea Herrerar", "ANDA876", "andrea@java.com", "1234"));
        car2.passenger = 4;
        car2.printDataCar(); */
    }
}