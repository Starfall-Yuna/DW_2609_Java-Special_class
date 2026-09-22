
public class D_constructor {
    public static void main(String[] args) {
        // Student();
        Student s1 = new Student();     // Student() 생성자 호출
        System.out.println(s1.name+" "+s1.gender);

        Student s2 = new Student("Lee", "Male");    // Student(String, String) 생성자 호출
        System.out.println(s2.name+" "+s2.gender);

        // 생성자도 오버로딩 적용O
    }
}

class Student{
    public String name;
    public String gender;

    // * 생성자 :: 특수한 메소드, 멤버 함수
    //  1) 클래스명과 동일
    //  2) 결과값 제시(반환형X)
    //  3) 인스턴스 생성 구문에서만 호출O
    public Student(){
        name = "None";
        gender = "None";
    }
    public Student(String n, String g){
        name = n;
        gender = g;
    }
}