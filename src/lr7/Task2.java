package lr7;

public class Task2 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("str for super");
        SubClass subClass = new SubClass("str for sub", 322);

        assert superClass.getLenStr1() == 13;
        superClass.setValues();
        assert superClass.getLenStr1() == 7;
        superClass.setValues("abc");
        assert superClass.getLenStr1() == 3;

        assert subClass.getLenStr1() == 11;
        subClass.setValues();
        subClass.setValues("aaa");
        subClass.setValues(256);
        subClass.setValues("abc", 512);
    }

    static private class SuperClass {
        private String str1;

        SuperClass(String str1) {
            this.str1 = str1;
        }

        public void setValues() {
            this.str1 = "Default";
        }

        public void setValues(String str1) {
            this.str1 = str1;
        }

        public int getLenStr1() {
            return str1.length();
        }
    }

    static private class SubClass extends SuperClass {
        public int int1;

        SubClass(String str1, int int1) {
            super(str1);
            this.int1 = int1;
        }

        @Override
        public void setValues() {
            super.setValues("Default");
            this.int1 = 0;
        }

        @Override
        public void setValues(String str1) {
            super.setValues(str1);
        }

        public void setValues(int int1) {
            this.int1 = int1;
        }

        public void setValues(String str1, int int1) {
            super.setValues(str1);
            this.int1 = int1;
        }

    }
}
