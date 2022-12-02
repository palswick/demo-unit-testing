public class Util {
    static void waiter() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
