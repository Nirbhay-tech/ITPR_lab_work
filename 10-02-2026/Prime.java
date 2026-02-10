class Prime{
    //main method
    public static void main(String[] args) {
    System.out.println("Prime numbers between 1 and 100");
    boolean isPrime;  // variable to take result prime or not

    for(int i=2;i<=100;i++){
        isPrime=true;  // we assume all are prime 
        for (int j=2;j<=i/2;j++){
            if(i%j==0){
                isPrime=false; // it is not prime as it completely divisible by other numbers
                break;
            }
        }
        if(isPrime){
            System.out.print(i+" "); // to display all prime numbers
        }
    }
    }
}