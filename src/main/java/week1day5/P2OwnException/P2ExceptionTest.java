package week1day5.P2OwnException;

public class P2ExceptionTest {
    public static void main(String[] args) {
        try {
            int num1 = 7;
            int num2 = 2;
            if(num1 % num2 != 0){
                throw new NonIntResultException(num1, num2);
            }
        }catch (NonIntResultException e){
            e.printStackTrace();
        }
    }
}
