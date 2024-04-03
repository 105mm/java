public class DataType01 {
    public static void main(String[] args) {  //psvm
        int num;

        byte n1 = 127; // -128 ~ 127
        short n2 = 30000; // -32768 ~ 32767


        boolean b1 = true;
        boolean b2 = false;
        // boolean b3 = 10; // 오류


        char c1 = '가';
        // char c2 = "가"; // 오류
        String s1;
        s1 = "java";
        // s1 = 'a'; // 오류
        s1 = "a";

        int c = 3;
        double d = 5.5;
        c = (int)d; // 강제형변환

        System.out.println(c);
    }


}
