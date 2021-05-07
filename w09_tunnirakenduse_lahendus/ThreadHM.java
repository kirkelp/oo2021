public class ThreadHM {
    public static String[] homework = { "1-10", "10-1", "a-k", "k-a"};

  public static void main(String[] args) {

    for (int i = 0; i < 4; i++){
      try {
        new Thread(getRunnable(), homework[i]).start();
        Thread.sleep(500);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

public static Runnable getRunnable(){
    return () -> {
      for (int i = 0; i < 10; i++){
        try {
          System.out.println(Thread.currentThread().getName().equals("1-10") + " 1-10 : " + (i + 1));
          System.out.println(Thread.currentThread().getName().equals("10-1") + " 10 - 1 :" + (10 - i));
          System.out.println(Thread.currentThread().getName().equals("a-k") + " a - k :" + ((char)(i + 98)));
          System.out.println(Thread.currentThread().getName().equals("k-a") + " k - a :" + ((char)(106 - i)));
          Thread.sleep(1000);
          }catch (Exception e) {
            System.out.println(e.getMessage());
          }
          
      }
    };
  }
}