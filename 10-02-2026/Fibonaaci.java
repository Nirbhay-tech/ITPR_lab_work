class Fibonaaci{
    public static void main(String[] args){
        int a=0;
        int b=1;

        for(int i=1;i<=30;i++){
            System.out.println(a+" ");
        
        int next=a+b;
        a=b;
        b=next;
        }
   
    }

}

