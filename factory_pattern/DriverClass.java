class DriverClass {
    public static void main(String[] args) {
    
        Vehical obj1 = VehicalFactory.getVehical("CAR");
        System.out.println(obj1.getDetails());

        Vehical obj2 = VehicalFactory.getVehical("BIKE");
        System.out.println(obj2.getDetails());   
    }
}