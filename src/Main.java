public class Main {


    public static void main(String[] args) {
        int num = 29;
        int prime = 0;

        prime = isPrime(num, num / 2);

        if (prime == 1) System.out.println("Asaldir.");
        else {
            System.out.println("asal degildir.");
        }

    }

    public static int isPrime(int sayi, int i) {
        if (i==1) {
            return 1;
        }

        else {
            if (sayi % i == 0)
            {
                return 0;
            }
            else
            {
                return isPrime(sayi, i - 1);
            }
        }

    }
}


