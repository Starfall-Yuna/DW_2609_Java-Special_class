
// "부모가 자식에게 상속한다.", "자식은 부모에게 상속받는다."
// 상속(extends) :: 클래스의 멤버를 다른 클래스에 물려주는 문법 (재사용 및 확장 목적)

public class A_extends{
    public static void main(String[] args) {
        Computer c = new Computer();
        c.device_name = "DESKTOP-123456";
        c.ram = 32;
        // c.gram = 1.5;    // 에러 발생 -> 접근X 멤버  
        c.printSpec1();
        // c.printSpec2();  // 에러 발생 -> 접근X 멤버  

        
        NoteBook n = new NoteBook();
        n.device_name = "DESKTOP_989989";
        n.os = "Windows 11";
        n.printSpec1();

        n.gram = 1.19;      // 부모 클래스의 멤버 접근O
        n.battery = 50;
        n.printSpec2();
    }
}

class Computer{     // 부모 클래스
    // 멤버 구성 :: device_name, ram, os
    public String device_name;
    public int ram;
    public String os;

    public void printSpec1(){
        System.out.println("모델명: "+device_name);
        System.out.println("램(GB): "+ram);
        System.out.println("운영체제: "+os);
    }
}
class NoteBook extends Computer{    // 자식 클래스
    // 멤버 구성 :: (device_name, ram, os), gram, battery
    //      extends Computer로 인해, () 안의 멤버도 NoteBook에서 사용 가능
    public double gram;
    public int battery;

    public void printSpec2(){
        System.out.println("모델명: "+device_name);
        System.out.println("램(GB): "+ram);
        System.out.println("운영체제: "+os);
        System.out.println("무게(KG): "+gram);
        System.out.println("배터리 용량: "+battery);
    }
}
