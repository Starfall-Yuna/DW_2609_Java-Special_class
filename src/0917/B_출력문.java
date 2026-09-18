
//  !! 주의할 점 :: ;(세미콜론) 누락 조심하기 -> SyntexError !! 

public class B_출력문 {
    public static void main(String[] args) {
        // 줄바꿈, 개행 :: '\n'

        System.out.print("안녕하세요");     // "안녕하세요"만 출력
        System.out.println("안녕하세요"); 
        
        System.out.println("안녕하세요");   // "안녕하세요" 출력+"\n(줄바꿈)"
        System.out.print("안녕하세요");

        // System.out.printf() :: 본래 C언어 출력문
        System.out.printf("Hello, World");
        System.out.printf("이번 해는 %d년입니다.", 2026);
            // %d를 만나면 -> 뒤에 있는 값인 2026을 가져옴 -> %d 자리를 메꿈
    }
}
