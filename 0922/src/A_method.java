
public class A_method{
    // 메소드, 함수 :: "명령문들을 하나로 묶은 것"
    // public static [반환_자료형] [함수이름](매개변수 구성...){
    //     실행할 명령문...이것저것
    // }

    // 매개변수 :: 함수 실행에 필요한 값 정의
    //  "printAdd() 함수 활용하려면, 2개의 정수형 값(매개변수)이 필요"
    public static void printAdd(int n1, int n2){
        System.out.println("덧셈 결과: "+(n1+n2));
    }
    public static void printAdd(int n1){
        System.out.println("1 더한 결과: "+(n1+1));
    }
    public static void printAdd(int n1, int n2, int n3){
        System.out.println("덧셈 결과: "+(n1+n2+n3));
    }
    // 오버로딩 :: "매개변수 구성이 다르면, 동일한 이름의 함수 함께 사용O"

    // 반환(return) :: 결과값을 "뱉는다"
    //  void형은 return문 작성X
    
    // add() 사용하면,
    //    필요한 값 :: 2개의 int형 값 / 결과값 :: double형
    public static double add(int n1, int n2){
        return n1+n2;
    }

    public static void printAny(){
        System.out.println("함수를 사용하면");
        System.out.println("여러 명령문을");
        System.out.println("한번에");
        System.out.println("실행할 수 있어요");
    }
    
    // 프로그램 실행하면, main() 안의 내용만 실행
    public static void main(String[] args) {
        printAny();

        // printAdd();
        printAdd(3, 5);     // 3은 n1으로, 5는 n2로
        printAdd(10);
        printAdd(10, 100, 1000);

        double result = add(3, 5);  // 8.0 결과를 result에 저장
        System.out.println(add(3, 5));  // 8.0 결과를 출력
    }
}