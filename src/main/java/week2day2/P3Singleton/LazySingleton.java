package week2day2.P3Singleton;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){
        System.out.println("Lazy Singleton Initialization");
    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }


}
