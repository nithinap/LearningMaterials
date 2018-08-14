

public class ClientServerJVM {
    public ClientServerJVM() {
        super();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        spendTime();
        long end = System.currentTimeMillis();
        System.out.println("Time spent: "+ (end-start));

        ClientServerJVM loopTest = new ClientServerJVM();
    }

    private static void spendTime() {
        for (int i =500000000;i>0;i--) {
        }
    }
}