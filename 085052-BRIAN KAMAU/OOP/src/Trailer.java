class Trailer extends Vehicle {
    private int cargoCapacity;
    private boolean isEnclosed;

    public Trailer(String make, String model,String type, int cargoCapacity, boolean isEnclosed) {
        super(make, model,type);
        this.cargoCapacity = cargoCapacity;
        this.isEnclosed = isEnclosed;
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the trailer.");
    }

    public void unloadCargo() {
        System.out.println("Unloading cargo from the trailer.");
    }
}