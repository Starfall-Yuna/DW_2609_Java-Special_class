
public class C_변수 {
    public static void main(String[] args) {
        // 변수 :: 값을 담는 공간/상자

        // [자료형] [만들_변수_이름];   -> 변수 선언
        int year;

        // [변수_이름] = [값];      -> 값 설정
        year = 2026;

        // [자료형] [만들_변수_이름] = [값];    -> 변수 초기화
        int month = 9;

        System.out.printf("지금은 %d년 %d월입니다.", year, month);
            // 첫번째 %d :: year값 들어가고
            // 두번째 %d :: month값 들어감
    }    
}
