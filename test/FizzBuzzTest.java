import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void testIfThreeReturnsFizz(){
        assertEquals(fizzbuzz.getOutput(3), "Fizz");
    }

    @Test
    public void testIfFiveReturnsBuzz(){
        assertEquals(fizzbuzz.getOutput(5), "Buzz");
    }

    @Test
    public void testIfFifteenReturnsFizzBuzz(){
        assertEquals(fizzbuzz.getOutput(15), "FizzBuzz");
    }

    @Test
    public void testIfOneReturnsOne(){
        assertEquals(fizzbuzz.getOutput(1), "1");
    }

}