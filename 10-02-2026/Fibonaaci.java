class Fibonaaci{
    // creating a main method
    public static void main(String[] args){
        // first two values in fibonaaci
        int a=0;
        int b=1;
        int next;

    // for loop to print fibonaaci
        for(int i=1;i<=30;i++){
            System.out.println(a+" ");
        
        next=a+b; //contains next value
        a=b;
        b=next;
        }
   }
}

