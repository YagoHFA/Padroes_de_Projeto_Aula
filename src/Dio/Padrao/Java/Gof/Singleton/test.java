package Dio.Padrao.Java.Gof.Singleton;

public class test {
    public static void main(String[] args) {
        Singleton lazy = Singleton.getInstance();
        System.out.println(lazy);
        lazy = Singleton.getInstance();
        System.out.println(lazy);

        Sigleton2 eagler = Sigleton2.getInstance();
        System.out.println(eagler);
        eagler = Sigleton2.getInstance();
        System.out.println(eagler);

        Holder hold = Holder.getInstance();
        System.out.println(hold);
        hold = Holder.getInstance();
        System.out.println(hold);

    }
}
