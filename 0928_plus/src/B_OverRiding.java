
// 오버라이딩 :: "상속받은 메소드의 내용을, 자식클래스에서 재정의하여 사용할 수 있다."

public class B_OverRiding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.print(); 
        Dog d = new Dog();
        d.print();
        Cat c = new Cat();
        c.print();

        // 위 print() 결과 모두 다름
    }
}

class Animal{
    public void print(){
        System.out.println("동물입니다.");
    }
}
class Dog extends Animal{
    // Animal의 print() 재정의
    public void print(){
        System.out.println("강아지입니다.");
    }
}
class Cat extends Animal{
    // Animal의 print() 재정의
    public void print(){
        System.out.println("고양이입니다.");
    }
}