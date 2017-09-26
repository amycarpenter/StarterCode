
// add range to Vehicle

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // display the range
    int range() {
        return fuelcap * mpg;
    }
}

class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        
        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();   // display range of minivan
        range2 = sportscar.range();   // display range of sportscar

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles.");                
    }
}