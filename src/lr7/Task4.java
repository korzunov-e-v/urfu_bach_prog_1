package lr7;

import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        char defaultCh = 'a';
        String defaultStr = "string";
        int defaultInt = 10;

        // create first instances with default values
        SuperSuperClass superSuperClass = new SuperSuperClass(defaultCh);
        SuperClass superClass = new SuperClass(defaultCh, defaultStr);
        SubClass subClass = new SubClass(defaultCh, defaultStr, defaultInt);

        // create copies of first instances
        SuperSuperClass superSuperClassCopy = new SuperSuperClass(superSuperClass);
        SuperClass superClassCopy = new SuperClass(superClass);
        SubClass subClassCopy = new SubClass(subClass);

        // change first instances
        superSuperClass.ch1 = 'b';
        superClass.str1 = "string2";
        subClass.int1 = 100;

        // check if copies not changes
        assert Objects.equals(superSuperClassCopy.ch1, defaultCh);
        assert Objects.equals(superClassCopy.str1, defaultStr);
        assert Objects.equals(subClassCopy.int1, defaultInt);

    }

    private static class SuperSuperClass {
        public char ch1;

        SuperSuperClass(char ch1) {
            this.ch1 = ch1;
        }

        SuperSuperClass(SuperSuperClass obj) {
            this.ch1 = obj.ch1;
        }

    }

    private static class SuperClass extends SuperSuperClass {
        public String str1;

        SuperClass(char ch1, String str1) {
            super(ch1);
            this.str1 = str1;
        }

        SuperClass(SuperClass obj) {
            super(obj.ch1);
            this.str1 = obj.str1;
        }
    }

    private static class SubClass extends SuperClass {
        public int int1;

        SubClass(char ch1, String str1, int int1) {
            super(ch1, str1);
            this.int1 = int1;
        }

        SubClass(SubClass obj) {
            super(obj.ch1, obj.str1);
            this.int1 = obj.int1;
        }

    }
}
