class VehicalFactory {

    public static Vehical getVehical(String type) {
        if(type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        else if(type.equalsIgnoreCase("CAR")) {
            return new Car();
        }
        else {
            return null;
        }
    }
}