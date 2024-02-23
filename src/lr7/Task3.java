package lr7;

public class Task3 {
    public static void main(String[] args) {
        SuperSuperClass superSuperClass = new SuperSuperClass(111);
        SuperClass superClass = new SuperClass(222, 'a');
        SubClass subClass = new SubClass(333, 'b', "default");

        superSuperClass.setValues(444);

        superClass.setValues(555);
        superClass.setValues(666, 'c');

        subClass.setValues(777);
        subClass.setValues(888, 'd');
        subClass.setValues(999, 'e', "custom");

        System.out.println(superSuperClass);
        System.out.println(superClass);
        System.out.println(subClass);

    }

    private static class SuperSuperClass {
        public int int1;

        public void setValues(int int1) {
            this.int1 = int1;
        }

        SuperSuperClass(int int1) {
            this.int1 = int1;
        }

        @Override
        public String toString() {
            String classNameAndVals;
            classNameAndVals = "(super super) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " int 1 = " + this.int1;
            return classNameAndVals;
        }
    }

    private static class SuperClass extends SuperSuperClass {
        public char ch1;

        public void setValues(int int1, char ch1) {
            super.setValues(int1);
            this.ch1 = ch1;
        }

        SuperClass(int int1, char ch1) {
            super(int1);
            this.ch1 = ch1;
        }

        @Override
        public String toString() {
            String classNameAndVals;
            classNameAndVals = "(super) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " int 1 = " + this.int1 + "\n" +
                    " ch 1 = " + this.ch1;
            return classNameAndVals;
        }
    }

    private static class SubClass extends SuperClass {
        public String str1;

        public void setValues(int int1, char ch1, String str1) {
            super.setValues(int1, ch1);
            this.str1 = str1;
        }

        SubClass(int int1, char ch1, String str1) {
            super(int1, ch1);
            this.str1 = str1;
        }

        @Override
        public String toString() {
            String classNameAndVals;
            classNameAndVals = "(sub) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " int 1 = " + this.int1 + "\n" +
                    " ch 1 = " + this.ch1 + "\n" +
                    " str 1 = " + this.str1;
            return classNameAndVals;
        }
    }
}
