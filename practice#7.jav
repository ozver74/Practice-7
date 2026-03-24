import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random randGenerator;
    private ArrayList<String> responses;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        randGenerator = new Random();        
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom(int range)
    {
        System.out.println("One random: " + randGenerator.nextInt(range));
    }
    
    public void printMultiRandom(int howMany, int range)
    {
        for(int i=1; i < howMany+1; i++)
        {
            int number = randGenerator.nextInt(range);
            System.out.println("Multi Random (" + i + ")" + number);
        }
    }
    
    public int randomTester()
    {
        return randGenerator.nextInt(6) + 1;
    }
    
    public String getResponse()
    {
        int index = randGenerator.nextInt(responses.size());
        return responses.get(index);
    }

    public int randomFrom1ToMax(int max)
    {
    return randGenerator.nextInt(max) + 1;
    }

    public int randomFromMinToMax(int min, int max)
    {
    return randGenerator.nextInt(max - min + 1) + min;
    }
}
