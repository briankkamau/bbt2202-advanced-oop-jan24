class Boat extends Vehicle {
    private double length;
    private boolean isSailboat;

    public Boat(String make, String model,String type, double length, boolean isSailboat) {
        super(make, model,type);
        this.length = length;
        this.isSailboat = isSailboat;
    }

    public void startSailing() {
        System.out.println("Setting sail!");
    }

    public void dropAnchor() {
        System.out.println("Dropping anchor.");
    }
}