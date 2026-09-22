
// 객체, 클래스, 인스턴스 개념 :: 사진 참고
public class C_class {
    public static void main(String[] args) {
        // 인스턴스 생성 ::
        //  [클래스명] [인스턴스명] = new [생성자_호출];
        Computer c1 = new Computer();

        // 멤버 활용 :: [인스턴스명].[멤버이름]
        c1.device_name = "DESKTOP-123456";
        c1.ram = 8;
        c1.graphic = 2;
        c1.os = "Windows 11";

        Computer c2 = new Computer();
        c2.device_name = "DESKTOP-abcdef";
        c2.ram = 16;
        c2.graphic = 4;
        c2.os = "Windows 11";

        c1.print();
        System.out.println();
        c2.print();
    }
}

// <클래스 생성>
// class [클래스명]{
//      필드 선언... 메소드 선언... 생성자 선언...
// }
class Computer{
    // 필드(멤버변수) :: 기종명, ram용량, 그래픽용량, 운영체제
    public String device_name;
    public int ram;
    public int graphic;
    public String os;

    // 생성자 안 만들면? 기본생성자로 인스턴스 생성
    // public Computer(){
    // }

    // 멤버 함수 :: print()
    public void print(){
        System.out.println("모델명: "+device_name);
        System.out.println("램(GB): "+ram);
        System.out.println("그래픽(GB): "+graphic);
        System.out.println("운영체제: "+os);
    }
}