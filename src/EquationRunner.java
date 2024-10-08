import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        // stores user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first coordinate point: ");
        String point1 = s.nextLine();
        System.out.print("Enter your second coordinate point: ");
        String point2 = s.nextLine();

        //pick out the actual coordinates from the string
        String x1 = point1.substring(1, point1.indexOf(","));
        String y1 = point1.substring(point1.indexOf(",") + 1, point1.length() - 1);
        String x2 = point2.substring(1, point2.indexOf(","));
        String y2 = point2.substring(point2.indexOf(",") + 1, point2.length() - 1);

        //parse the coordinates into integers
        int x1Num = Integer.parseInt(x1);
        int y1Num = Integer.parseInt(y1);
        int x2Num = Integer.parseInt(x2);
        int y2Num = Integer.parseInt(y2);

        //make an instance of the LinearEquation class
        LinearEquation l = new LinearEquation(x1Num, y1Num, x2Num, y2Num);
        System.out.println(l);

        // stores x3 and find third point
        System.out.print("Enter a third x-value: ");
        String x3 = s.nextLine();
        double x3Num = Double.parseDouble(x3);
        double y3 = l.calculateThirdPoint(x3Num);
        System.out.println("Solved coordinate point is: " + "(" + x3Num + "," + y3 + ")");

    }
}
