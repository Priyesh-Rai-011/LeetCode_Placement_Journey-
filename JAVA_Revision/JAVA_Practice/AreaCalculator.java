//import java.util.Scanner;
//public class AreaCalculator {
//
//    public static double calculateArea(int choice, double... dimensions) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your choice (1 for circle, 2 for rectangle): ");
//        choice = sc.nextInt();
//        switch (choice) {
//            case 1: // Circle
//                System.out.print("Enter radius: ");
//                double radius = sc.nextDouble();
//                System.out.println("Area of circle: " + calculateArea(choice, radius));
//
//                return Math.PI * dimensions[0] * dimensions[0];
//            case 2: // Rectangle
//                System.out.print("Enter length: ");double length = sc.nextDouble();
//                System.out.print("Enter width: ");double width = sc.nextDouble();
//                System.out.println("Area of rectangle: " + calculateArea(choice, length, width));
//                break;
//
//                return dimensions[0] * dimensions[1];
//            default:
//                throw new IllegalArgumentException("Invalid choice. Please choose 1 for circle or 2 for rectangle.");
//        }
////        return dimensions[0];
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
