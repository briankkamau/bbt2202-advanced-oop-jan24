class Motorcycle extends Vehicle {
    private int numWheels;
    private boolean hasSidecar;

    public Motorcycle(String make, String model,String type, int numWheels, boolean hasSidecar) {
        super(make, model,type);
        this.numWheels = numWheels;
        this.hasSidecar = hasSidecar;
    }

    public void performWheelie() {
        System.out.println("Performing a wheelie!");
    }

    public void honkHorn() {
        System.out.println("Beep beep!");
    }
}
