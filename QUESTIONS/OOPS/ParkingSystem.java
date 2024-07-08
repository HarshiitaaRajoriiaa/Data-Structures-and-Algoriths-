package QUESTIONS.OOPS;
//https://leetcode.com/problems/design-parking-system/submissions/1313846920/
class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) { // Big car
            if (big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        }
        if (carType == 2) { // medium car
            if (medium > 0) {
                medium--;
                return true;
            } else {
                return false;
            }
        }
        if (carType == 3) { // medium car
            if (small > 0) {
                small--;
                return true;
            } else {
                return false;
            }
        }
        else {
            return false; // Invalid car type
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
