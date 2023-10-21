package week1day5;

public class Test20231020_1 {
    public static void main(String[] args) {
        try{
            recursiveCall(0); // Initiating the recursive calls
        }catch (Error error){
            System.out.println("!!!: " + error);
        }
    }

    public static void recursiveCall(int number) {
        System.out.println(number);
        try{
            //int number = "four";
        }
        catch (Exception e){
            e.printStackTrace();
        }

        recursiveCall(number + 1); // Recursive call without a base case, causing StackOverflowError
    }
}
