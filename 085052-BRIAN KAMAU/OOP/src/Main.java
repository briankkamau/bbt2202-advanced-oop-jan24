public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", "Superbike", 2,false);
        Bus bus = new Bus("Mercedes", "Sprinter", "Coach", 44,true);
        Trailer trailer = new Trailer("Utility", "Flatbed", "Refrigirated", 10000,true);
        Boat boat = new Boat("Yamaha", "WaveRunner", "Speedboat", 100,true);

        motorcycle.displayInfo();
        motorcycle.honkHorn();
        motorcycle.performWheelie();

        bus.displayInfo();
        bus.announceStops();
        bus.openDoors();

        trailer.displayInfo();
        trailer.loadCargo();
        trailer.unloadCargo();

        boat.displayInfo();
        boat.startSailing();
        boat.dropAnchor();
    }
}