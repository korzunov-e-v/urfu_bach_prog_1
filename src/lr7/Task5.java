package lr7;

public class Task5 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("default");
        SubClass1 subClass1 = new SubClass1("custom1", 10);
        SubClass2 subClass2 = new SubClass2("custom2", 'a');

        superClass.printInfo();
        subClass1.printInfo();
        subClass2.printInfo();

        SuperClass special = new SubClass1("special", 200);
        special.printInfo();
    }

    private static class SuperClass {
        protected String str1;

        SuperClass(String str1) {
            this.str1 = str1;
        }

        public void printInfo() {
            String classNameAndVals;
            classNameAndVals = "(super) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " str 1 = " + this.str1;
            System.out.println(classNameAndVals);
        }
    }

    private static class SubClass1 extends SuperClass {
        protected int int1;

        SubClass1(String str1, int int1) {
            super(str1);
            this.int1 = int1;
        }

        @Override
        public void printInfo() {
            String classNameAndVals;
            classNameAndVals = "(sub) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " str 1 = " + this.str1 + "\n" +
                    " int 1 = " + this.int1;
            System.out.println(classNameAndVals);
        }
    }

    private static class SubClass2 extends SuperClass {
        protected char ch1;

        SubClass2(String str1, char ch1) {
            super(str1);
            this.ch1 = ch1;
        }

        @Override
        public void printInfo() {
            String classNameAndVals;
            classNameAndVals = "(sub) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " str 1 = " + this.str1 + "\n" +
                    " ch 1 = " + this.ch1;
            System.out.println(classNameAndVals);
        }
    }
}
