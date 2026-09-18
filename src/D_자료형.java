
public class D_자료형 {
    public static void main(String[] args) {
        // 자료형 :: 데이터의 종류

        // * 숫자형(정수) :: int(4byte), byte(1byte), short(2byte), long(8byte)
        byte b = 5;
        short s = 15;
        long l = 1000;
        System.out.printf("%d\n", s);   // 정수 표현 :: %d

        // * 숫자형(실수) :: float(4byte), double(8byte)
        float f = 3.14F;
        double d = 3.1415;
        System.out.printf("%.4f\n", d);     // 실수 표현 :: %f

        // * 문자형 :: char(1byte), String
        char c = '갉';
        String hello = "hello";
        System.out.printf("%c", c);         // 문자 표현 :: %c
        System.out.printf("%s", hello);     // 문자열 표현 :: %s

        // * 진위형 :: boolean  -> 참(true), 거짓(false)
        boolean b1 = true;
        boolean b2 = false;
        boolean tf = 1<4 ? true : false;
        System.out.println(tf);     // 결과값 :: true


        // 입력문(Scanner 활용) 내용은 생략
    }    
}
