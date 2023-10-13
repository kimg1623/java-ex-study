package oop;

public class StudentClassExample {
    /***
     * 요약: Student 클래스를 정의하고 생성, 사용하기
     * 메서드 1) int getTotal() : 국어, 영어, 수학 점수 합계 반환
     *       2) float getAverage() : 총점(국어+영어+수학)을 나눈 평균 반환
     *       3) 생성자
     *       4) String info() : Class 내용 String으로 반환
     */
    public static void main(String args[]) {
        System.out.println("----------getTotal()&getAverage()----------");
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
        System.out.println();

        System.out.println("----------생성자&info()----------");
        Student s2 = new Student("홍길동",1,1,100,60,76);
        System.out.println(s2.info());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        float avg = (float) (kor+eng+math)/3;
        return (float)(Math.round(avg*100)/100.0);
    }
    public Student(){}
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        String s;
        s=(name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage());
        return s;
    }
}