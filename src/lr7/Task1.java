package lr7;

public class Task1 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("первая строка суперкласса");
        System.out.println(superClass.toString());

        SubClass subClass = new SubClass("первая строка подкласса", "вторая строка подкласса");
        System.out.println(subClass.toString());

    }

    static private class SuperClass {
        private String str1;

        SuperClass(String str1) {
            this.str1 = str1;
        }

        @Override
        public String toString() {
            String classNameAndVals;
            classNameAndVals = "(super) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " str 1 = " + this.getStr1();
            return classNameAndVals;
        }


        public String getStr1() {
            return str1;
        }

        public void setStr1(String str1) {
            this.str1 = str1;
        }
    }

    static private class SubClass extends SuperClass {
        private String str2;

        SubClass(String str1) {
            super(str1);
        }

        SubClass(String str1, String str2) {
            super(str1);
            this.str2 = str2;
        }

        @Override
        public String toString() {
            String classNameAndVals;
            classNameAndVals = "(sub) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " str 1 = " + this.getStr1() + "\n" +
                    " str 1 = " + this.getStr2();
            return classNameAndVals;
        }

        public String getStr2() {
            return str2;
        }

        public void setStr2(String str2) {
            this.str2 = str2;
        }
    }

}
