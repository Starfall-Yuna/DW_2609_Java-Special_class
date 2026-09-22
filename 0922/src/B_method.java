
public class B_method {
    // 정보처리기사 기출문제
    static int a = 0;
    // 전역변수 :: 프로그램 시작 ~ 종료 존재하는 변수
	// 지역변수 :: 변수가 선언된 순간 ~ 선언된 공간이 끝나는 순간(}) 존재하는 변수
    //	나머지는 다... 지역변수
	
	static int func(int t) {
		a = a+t;
		return a;
	}
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			func(i);
		}
		System.out.print(a);
	}
}
