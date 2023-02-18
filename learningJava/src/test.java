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

        return 0;
    }

}
