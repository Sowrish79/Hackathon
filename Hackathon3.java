public class Hackathon3 {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        double point1 = 50.5;
        double point2 = 60.5;

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total waste = " + total);
    }
}