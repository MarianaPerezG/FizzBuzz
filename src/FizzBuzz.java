public class FizzBuzz {
    private int start;
    private int end;

    public FizzBuzz(){
        setStart(1);
        setEnd(100);

    }

    public FizzBuzz(int startFrom, int endTo){
        setStart(startFrom);
        setEnd(endTo);
    }

    private void setStart(int startFrom){
        start = startFrom;
    }

    private void setEnd(int endIn){
        end = endIn;
    }

    public void print(){

        for (int i=start; i < end; i++){
            System.out.println(getOutput(i));
        }
    }

    public static String getOutput(int num){

        if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }
        if (num % 3 == 0){
            return "Fizz";
        }

        if (num % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(num);

    }



}
