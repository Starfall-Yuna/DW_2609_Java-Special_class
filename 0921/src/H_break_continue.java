
public class H_break_continue {
    public static void main(String[] args) {
        int number = 0;
        while (true) { 
            number++;
            if(number>10) {break;}      // break :: 만나면, 반복문 탈출(아래)
            if(number%2!=0) {continue;} // continue :: 만나면, 반복문 가장 위로 감
            System.out.println(number);
        }// 탈출하면, 여기로
    }
}
