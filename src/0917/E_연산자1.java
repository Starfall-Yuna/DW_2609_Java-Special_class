
public class E_연산자1 {
    public static void main(String[] args) {
        // 연산자 :: 연산을 수행하는 기호

        // 산술 :: +, -, *, /(몫), %(나머지)
        // 대입 :: = (오른쪽 값을 왼쪽 변수에 "대입")
        //      => +=, -=, *=, /=, %=

        // 22년도 2회 출제 문제, 24년도 3회 출제 문제
        int i=17;
        i+=1;       // i값 :: 18
        i-=2;       // i값 :: 16
        i*=3;       // i값 :: 48
        i/=4;       // i값 :: 12
        i%=5;       // i값 :: 2
        System.out.println(i); 

        // 증감 :: ++(1증가), --(1감소)
        int test = 3;
        test--;
        System.out.println(test);   // 결과 :: 2
        test++;
        System.out.println(test);   // 결과 :: 3

        System.out.println(++test);     // 결과 :: 4
            // 1증가 먼저(4) -> 출력은 나중에
        System.out.println(test++);     // 결과 :: 4
            // 출력이 먼저(4 출력) -> 1증가 나중에(5)
        System.out.println(test);       // 결과 :: 5
    }
}
