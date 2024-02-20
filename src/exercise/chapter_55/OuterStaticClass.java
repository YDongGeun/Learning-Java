package exercise.chapter_55;

public class OuterStaticClass {

    private static int outerData;

    public static class InnerClass {
        private int innerData;
        public InnerClass(int innerData){
            this.innerData = innerData;
        }

        void display() {
            System.out.println("OuterData: " + outerData);
            System.out.println("InnerData: " + innerData);
        }
    }
}
