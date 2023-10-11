package pl.gornik;

public class Main {
    public final static double LICZBA_PI = 3.14;
    public static void main(String[] args) {
        double radius = 3;
        double pole = LICZBA_PI *radius * radius;
        System.out.println(pole);
        int a = 3;
        int b = 69;
        a+=b;
        System.out.println(a);
        int n1 = 4;
        int n2 = 2;
        if(n1 % 3 == 0 && n2 % 3 == 0 || n1 + n2 > 10){
            System.out.println(" liczby są podzielne przez 3 lub ich suma jest większa niż 10");
        }
        else{
            System.out.println("Liczby nie są podzielne przez 3 i ich sume nie wynosi więcej niż 10");
        }
    }
}