public class Hello {

    public static void main(String[] args) {
        sayHello();
        sayName("김세영");
        String bread = buyBread(1000);
        System.out.println(bread);

        int money = showMeTheMoney();
        System.out.println(money);

        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);
        System.out.println("프로그램 종료");



    }

    public static void sayHello() {
        System.out.println("안녕하세요.");
    }

    public static void sayName(String name) {
        System.out.println(name);
    }

    public static String buyBread(int money) {
        return money + "원 짜리 빵";
        // -> "1000원 짜리 빵"
    }

    public static int showMeTheMoney() {
        return 10000;
    }

    public static int sum(int n, int m) {
        return n + m;
    }

}