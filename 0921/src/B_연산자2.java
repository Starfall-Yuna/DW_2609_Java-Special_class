
public class B_연산자2 {
    public static void main(String[] args) {
        // 조건문
        // if(조건식){   true이면 실행, false이면 실행X
        //     조건식 만족하면 실행할 명령문...이것저것
        // }

        if(true){
            System.out.println("의미없지만 한번 출력해봄");
        }
        if(false){
            System.out.println("거짓이면 출력이 될까?");
        }

        // 비교연산자 :: <, >, <=, >=, ==(같다), !=(다르다)

        // "조건식을 잘 구성하자."
        // if - else if - else      (else if, else는 필요할 때만)
        int score = -10;
        if(score == 100){   // 80 == 100 (X)    -> 실행X
            System.out.println("A+");
        }
        else if(score >= 90){   // 80 >= 90 (X) -> 실행X
            System.out.println("A");
        }
        else if(score >= 80){   // 80 >= 80 (O) -> 실행O
            System.out.println("B");
        }
        else{   // score>=80 만족 -> else 실행X
            System.out.println("F");
        }

        // 논리연산자 :: &&(AND), ||(OR), !(NOT)
        // 0~100점 이외의 점수에 대해서는, "Error!"를 출력
        if(!(0<=score && score<=100)){      // (score<0 || 100<score)
            System.out.println("Error!");
        }
    }
}
