public class Test3 {
    int a;

    public void vartest(Test3 test){
        test.a++;
    }
    public static void main(String[] args) {
        // int a = 1;
        Test3 myTest = new Test3();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}
