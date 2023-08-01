public class TestingClass
{
    public static void checkScore(double score)
    {
        if (0 < score && score <= 50.00)
        {
            System.out.printf("Average score%n");
        }
        else if (50.00 < score && score <= 100.00)
        {
            System.out.printf("Very good score%n");
        }
        else
        {
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);
        }
        catch (ArithmeticException ex)
        {
            System.out.printf("%s\n", ex.getMessage());
        }
    }
}
