public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        
        int Fib1 = 1; 
        int Fib2 = 1; 
        int Fib3; 

        int[] Fibs = new int[x]; 

        for (int i = 0; i<x; i++) { 
            System.out.print(Fib1 + " "); 
            Fib3 = Fib1 + Fib2; 
            Fib1 = Fib2; 
            Fib2 = Fib3; 
            Fibs[i] = Fib1; 
        }
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (Fibs[i] % 2 == 1)
                numOdd++; 
            if (i < x - 1); 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
