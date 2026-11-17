public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        
        int approx = Integer.parseInt(args[0]); 
        for (int i=0; i<approx; i++) {
            if (i%2==0) {
                approxPi = approxPi + (double)1/(2*i+1); 
            }
            else {
                approxPi = approxPi - (double)1/(2*i+1);
            }
        }
        approxPi = 4*approxPi; 
        
        System.out.println(approxPi + " " + actualPi);
    }
}
