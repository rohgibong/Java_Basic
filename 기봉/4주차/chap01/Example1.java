package week04.chap01;

public class Example1 {
    public static void main(String[] args) {
        print("홍길동");
        print("홍길동", "이순신");
        print("홍길동", "이순신", "유성룡");
        print("홍길동", "이순신", "유성룡", "강감찬");
        print("홍길동", "이순신", "유성룡", "강감찬", "이도");
    }

    public static void print(String... str) {
        // 가변 인수인 str 매개변수는 String[] 배열 타입으로 받아들인다.
        for(String s : str) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
