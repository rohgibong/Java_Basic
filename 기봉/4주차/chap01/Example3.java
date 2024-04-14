package week04.chap01;

import java.util.Arrays;

class Printer {

    public void print(String c, String... str) {
        System.out.println("첫번째 메서드");
        System.out.println("rest parameters : " + Arrays.toString(str));
    }

    public void print(String... str) {
        System.out.println("두번째 메서드");
    }
}

public class Example3 {
    public static void main(String[] args) {
        Printer p = new Printer();

        // 이 메서드는 첫번째 메서드에도 두번째 메서드에서도 실행이 가능하기 때문에 컴파일러가 햇갈려 오류를 발생하게 된다.
        //p.print("-", "1", "2", "3");
    }
}
