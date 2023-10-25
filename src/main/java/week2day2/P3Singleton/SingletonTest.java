package week2day2.P3Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable singletonAccessRunnable = () -> {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + lazySingleton);
        };
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(singletonAccessRunnable);
            thread.start();
        }
    }
}
