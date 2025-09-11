public class Problem2
{
    public static void main(String[] args)
    {
        int num = 678;
        
        int truncNum = num;
        System.out.println(truncNum % 10);
        truncNum = truncNum / 10; 

        System.out.println(truncNum % 10);
        truncNum = truncNum / 10; 

        System.out.println(truncNum % 10);
        truncNum = truncNum / 10; 

    }
}                           