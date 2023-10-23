package week1day5;

public class Test20231022 {
    public static void main(String[] args) {
        int ans = myTest();
        System.out.println("Ans: " + ans);
    }

    public static int myTest(){
        try{
            int num1 = 2;
            int num2 = 0;
            int num3 = num1 / num2;
            System.out.println(1);
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(2);
            return 2;
        }finally {
            System.out.println(3);
            return 3;
        }
    }
}
