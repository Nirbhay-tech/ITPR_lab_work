class Fibonaaci{
    // creating a main method
    public static void main(String[] args){
        
        int a=0;
        int b=1;

    // for loop to print fibonaaci
        for(int i=1;i<=30;i++){
            System.out.println(a+" ");
        
        int next=a+b; //contains next value
        a=b;
        b=next;
        }
   }
}

