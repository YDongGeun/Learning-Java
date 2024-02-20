package exercise.chapter_55;

public class OuterClassTest {
    public static void main(String[] args) {
        // 일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(10);

        innerClass.display();

        // 정적 중첩 클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass();
        OuterStaticClass.InnerClass innerClass1 = new OuterStaticClass.InnerClass(10);

        innerClass1.display();
    }
}
