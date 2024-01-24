class Bus extends Vehicle {
    private int capacity;
    private boolean isDoubleDecker;

    public Bus(String make, String model,String type, int capacity, boolean isDoubleDecker) {
        super(make, model,type);
        this.capacity = capacity;
        this.isDoubleDecker = isDoubleDecker;
    }

    public void announceStops() {
        System.out.println("Next stop: ...");
    }

    public void openDoors() {
        System.out.println("Doors opening.");
    }
}