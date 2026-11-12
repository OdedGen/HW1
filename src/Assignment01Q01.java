public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (String arg : args) {
            if ((int)arg.charAt(0)%5==0) {
                System.out.println(arg.charAt(0));
            }
        }
    }
}
