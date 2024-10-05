package arrays;

public class Kontrollflus {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0};
        double wert =  mittelwert(array);
        System.out.println(wert);
    }

    public static double mittelwert(double [] a) {
        double sum = a[0];
        int i = 1;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        double resultat = sum / a.length;
        return resultat;
    }
}
