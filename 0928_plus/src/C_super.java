
// extends 하는 클래스의 인스턴스 생성할 시 주의할 점,
//  "부모 클래스의 생성자를 먼저 실행한 뒤, 자기 자신의 생성자를 실행함"
//      => super() :: 부모 클래스 생성자 호출

public class C_super {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
            // "Phone 생성자" 출력(부모생성자) -> "SmartPhone 생성자" 출력(자식생성자)
        SmartPhone sp = new SmartPhone("Galaxy S20", "010-1234-1234", "Windows 11", "5G");
    
        System.out.println(sp.model);
        System.out.println(sp.number);
    }
}

class Phone{
    public String model;
    public String number;

    public Phone(){
        System.out.println("Phone 생성자");
    }
    public Phone(String m, String n){
        this.model = m;
        this.number = n;
    }
}
class SmartPhone extends Phone{
    public String os;
    public String internet;

    public SmartPhone(){
        System.out.println("SmartPhone 생성자");
    }
    public SmartPhone(String m, String n, String o, String i){
        super(m, n);
            // 없으면 Phone() 실행, 있으면 Phone(String, String) 실행
        this.os = o;
        this.internet = i;
    }
}