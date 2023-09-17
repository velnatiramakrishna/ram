package loopingStatements;

public class Forloopevennum
{
	
	public static void main(String[] args)
	{
		System.out.println("the even numbers are");
	int i=0,num=10;
	for( i=1;i<=num;i++) {
		if (i%2==0) {
			System.out.println(i);
		}
	}
}
}
/*{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");

        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}*/

