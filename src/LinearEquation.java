public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

        public String slopeCalculator() {
            String slope = null;
            int run = x2 - x1;
            int rise = y2 - y1;
            if (rise % run == 0) {
                slope = Integer.toString(rise / run);
            } else if (rise / run == 1) {
                slope = "";
            } else if (rise / run == -1) {
                slope = "-";
            } else {
                if (rise > 0 && run < 0) {
                    run = run * -1;
                    rise = rise * -1;
                    slope = rise + "/" + run;
                } else if (rise < 0 && run < 0) {
                    run = run * -1;
                    rise = rise * -1;
                    slope = rise + "/" + run;
                }
            }
            return slope;
        }

        public double calculateYIntercept () {
            int y = y1;
            double mx = (double) (x2 - x1) / (y2 - y1) * x1;
            double b = Math.round((y - mx) * 100.0) / 100.0;
            return b;
        }

        public String createLinearEquation () {
            String equation = "y = " + slopeCalculator() + "x + " + calculateYIntercept();
            return equation;
        }

        public double distanceCalculator () {
            double distance = Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 100.0) / 100.0;
            return distance;
        }

        public String toString () {
            String str = "First Point: (" + x1 + "," + y1 + ")\n";
            str += "Second Point: (" + x2 + "," + y2 + ")\n";
            str += "Slope: " + slopeCalculator() + "\n";
            str += "Y-intercept: " + calculateYIntercept() + "\n";
            str += "Distance between points: " + distanceCalculator() + "\n";
            str += "Slope intercept form: " + createLinearEquation();
            return str;
        }

        public double calculateThirdPoint ( double x3){
            double y3 = Math.round((x3 * (double) (x2 - x1) / (y2 - y1) + calculateYIntercept()) * 100.0) / 100.0;
            return y3;
        }

    }
