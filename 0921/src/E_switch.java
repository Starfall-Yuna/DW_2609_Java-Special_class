
public class E_switch {
    public static void main(String[] args) {
        // switch(변수){
        //     case [값]: 
        //          변수값==값일때, 실행할 명령문...
        // }

        int menu = 1;
        switch(menu){
            case 1:     // menu==1라면,  
                System.out.println("1번 메뉴는 콜라입니다.");
                break;  //  각 case마다 break; 써야 잘 작동함
            case 2:     // menu==2라면,
                System.out.println("2번 메뉴는 사이다입니다.");
                break;
            default:    // else랑 유사
                System.out.println("값 설정을 다시 하십시오.");
        }
    }    
}
