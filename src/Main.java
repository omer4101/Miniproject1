public class Main {
    public static void main(String[] args) {
        int number = 79;
        int remainder = number % 2;
        boolean durum = true;
        if (number<2){
            durum=false;
        }
        for (int i=2; i<number;i++) {
           if(number % i ==0){
               durum = false;
           }
        }
        if (durum){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number!!!");
        }

    }
}



