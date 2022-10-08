/**
 * @author jhuan
 * @version 1.0
 * @description:
 * @date 2022年10月08日 23:11
 */
public class Singleton {

    private Singleton() {
        System.out.println("gen success");
    }

    private static Singleton instance;
    private static Singleton eager = new Singleton();

    /**
     * 懒汉式
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            // 存在线程安全问题
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 饿汉式
     * @return Singleton
     */
    public static Singleton eagerGet(){
        return eager;
    }
}
