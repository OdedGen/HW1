public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        boolean isEven = true;
        int precision = Integer.parseInt(args[0]);
        for (int i = 0; i < precision; i++) {
            if (isEven) {
                approxPi += 4.0 / (2 * i + 1);
            } else {
                approxPi -= 4.0 / (2 * i + 1);
            }
            isEven = !isEven;
        }


        
        System.out.println(approxPi + " " + actualPi);
    }
}
