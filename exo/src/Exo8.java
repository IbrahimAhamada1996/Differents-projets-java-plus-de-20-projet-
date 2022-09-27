public class Exo8 {

    public static void main(String[] args) {
        perfertAll();
        perfect(6);
    }

    static void perfertAll(){
        int i, j, sum;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i <= 1000;i++){      // i es el número que vamos a comprobar
            sum = 0;
            for(j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1
                if(i % j==0){
                    sum = sum + j; // si es divisor se suma
                }
            }
            if(i == sum){             // si el numero es igual a la suma de sus divisores es perfecto
                System.out.println(i);
            }
        }
    }

    static void perfect(int n){
        int sum=0 ;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                sum+=i;
            }
        }

        if(n == sum){             // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println(n);
        }
    }
}
