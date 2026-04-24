class Temp {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = 10, b = 20;
        int c;

        System.out.println("Enter the value of c: ");
        c = sc.nextInt();

        int sum = a + b + c;
        int average = sum / 3;
        int product = a * b * c;

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The product is: " + product);

        if (sum % 2 == 0) {
            System.out.println("Sum is Even");
        } else {
            System.out.println("Sum is Odd");
        }

        sc.close();
    }
}