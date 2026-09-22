
public class G_for {
    public static void main(String[] args) {
        // for (제어변수 선언 ; 조건식; 제어변수 연산) {
        // }

        // 제어변수 :: i
        //  int i = 0       ->  for문에서 처음 딱 한번만
        //  i<3 비교, i++ 연산  -> 반복할때마다 실행
        // int i;
        for(int i = 0; i<3; i++ ){      // i는 for문 안에서만 사용O
            System.out.println(i);
        }
        System.out.println();

        // for문을 활용한 다중 반복문
        //      !! 제어변수(i, j) 생성/소멸 순간들을 확인해야함 !!
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
