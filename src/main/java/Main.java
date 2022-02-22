import Tests.TestHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        GetInformation.outClassInfo(String.class);

        System.out.println();
        Testing testing = new Testing();
        TestHandler.start(testing.getClass());
    }
}
