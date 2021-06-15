public class ArrayMean 
{
    public static void main(String[] args) 
        {
        double[] a= {56.41, 63.42, 86.17, 64.10, 42.61, 12.87, 27.39, 77.49, 95.71, 52.63};
        double sum = 0, average;

        int i;
        for(i = 0;i<(a.length);i++)
        {
            sum += a[i];
        }

        average = sum/a.length;

        System.out.println("The average of the elements of the array is " + average);

    }
}