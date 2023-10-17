package week1day2;

/*
* Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
* if the int variable "number" is 1, 2,... , 9, or other, respectively.
* Use (a) a "nested-if" statement; (b) a "switch-case" statement.
* */
public class P7PrintNumberInWord {
    public static void main(String[] args) {
        int test1 = 1;
        System.out.println(ByIf(test1));
        System.out.println(BySwitch(test1));
        int test2 = 9;
        System.out.println(ByIf(test2));
        System.out.println(BySwitch(test2));
        int test3 = 12;
        System.out.println(ByIf(test3));
        System.out.println(BySwitch(test3));
    }

    public static String ByIf(int num){
        if(num == 1){
            return "ONE";
        }else if(num == 2){
            return "TWO";
        }else if(num == 3){
            return "THREE";
        }else if(num == 4){
            return "FOUR";
        }else if(num == 5){
            return "FIVE";
        }else if(num == 6){
            return "SIX";
        }else if(num == 7){
            return "SEVEN";
        }else if(num == 8){
            return "EIGHT";
        }else if(num == 9){
            return "NINE";
        }else{
            return "OTHER";
        }
    }

    public static String BySwitch(int num){
        switch (num){
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default:
                return "OTHER";
        }
    }
}
