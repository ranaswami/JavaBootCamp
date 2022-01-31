package com.rana.oops;

public class InnerClasses {
    static class Test{
        //inner classes need to be static
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Rana");
        Test b = new Test("Ravi");
    }
}
//static class A{
//    it will show error
//}