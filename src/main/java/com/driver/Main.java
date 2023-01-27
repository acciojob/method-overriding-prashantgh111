package com.driver;


public class Main {
        public static class A {

            public String meth() {
                return "Invoking method from class A";
            }
        }
        public static class B extends A {
          // task 4:
            @Override
            public String meth(){
                return "Method is overridden in Extendend class B";
            }
        }

    public static void main(String[] args) {
        // create object og class and call from always main function.
        // task 3 : is not possible bcoz to call the method of parent class f u already extending it.
        //but for que we write as it is.
        B obj = new B();
        obj.meth();   // if i print then print "Method is overridden in Extendend class B";

        //task 5:
        B obj1 = new B();
        obj1.meth();   // if i print then print "Method is overridden in Extendend class B";
    }
}