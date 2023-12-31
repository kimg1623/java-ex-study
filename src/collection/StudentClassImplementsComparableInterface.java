package collection;


import java.util.*;

/***
 * 요약 : Comparable 인터페이스를 구현한 Student클래스
 * 1) 이름(name)이 기본 정렬기준이 되도록 compareTo()구현
 * 2) TreeSet이 학생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)선언
 * 2-1) TreeSet의 subSet() 메소드 활용
 */
class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ban +","+no +","+kor+","+eng +","+math+","+getTotal() +","+getAverage();
    }

    @Override
    public int compareTo(Object o) { // Comparable 인터페이스에서 구현해야하는 메소드
        if(o instanceof Student) {
            Student tmp = (Student)o;
            return name.compareTo(tmp.name); // String클래스의 compareTo()를 호출
                                             // 현재 클래스와 비교할 클래스의 name을 비교
                                             // compareTo 메소드를 기준으로 Collections.sort()가 실행됨
        } else {
            return -1;
        }
    }
}
public class StudentClassImplementsComparableInterface {
    static int getGroupCount(TreeSet tset, int from, int to) {
        Student s1 = new Student("",0,0,from,from,from);
        Student s2 = new Student("",0,0,to,to,to);
        return tset.subSet(s1,s2).size();
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("-----TreeSet 생성-----");
        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student) {
                    Student s1 = (Student)o1;
                    Student s2 = (Student)o2;
                    return (int)(s1.getAverage() - s2.getAverage());
                }
                return -1;
            }
        });
        set.add(new Student("홍길동",1,1,100,100,100));
        set.add(new Student("남궁성",1,2,90,70,80));
        set.add(new Student("김자바",1,3,80,80,90));
        set.add(new Student("이자바",1,4,70,90,70));
        set.add(new Student("안자바",1,5,60,100,80));
        it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set,70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));
    }
}