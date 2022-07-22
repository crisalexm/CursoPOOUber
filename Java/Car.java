 class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        System.out.println("passenger: " + passenger);
}
    
    void printDataCar(){
        if(passenger != null){
            System.out.println("License: " + license + "Name Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPasseInteger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        } else{
            System.out.println("Necesitas asignar sólo 4 pasajeros");
        }
    }
}
