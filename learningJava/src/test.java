import sun.lwawt.macosx.CSystemTray;

public class test {

    public static void main(String[] args) {
        //func1(6,6);
        System.out.println(func1(5));
    }
    public static int func1(int a){



        if (a < 9) {
            return 9;
        }

        if (a < 7) {
            return 7;
        }

        if (a < 4) {
            return 4;
        }
        if (a < 10) {
            return 56;
        }
        //some new code added 02/18/2023
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        return 0;
    }

}
