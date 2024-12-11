public class prime {
    public static void main(String[] args) {
        

        StringBuilder primeNumbers = new StringBuilder("Prime numbers from 1 to 100:\n");
        
       
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            
           
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            
            if (isPrime) {
                primeNumbers.append(num).append(" ");
            }
        }
        
     
        System.out.println(primeNumbers.toString());
    }
}