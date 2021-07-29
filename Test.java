public class Test {

    // both input & output
    public int sum(int a, int b){
        return a + b;
    }

    // only output(return)
    public String say(){
        return "Hi";
    }

    // Only input No output(return)
    public void sum2(int a, int b){
        System.out.println(a + " and " + b + " SUM: " + (a + b) + "입니다.");
    }

    // no input no output(return)
    public void say2(){
        System.out.println("Hi");
    }


    public static void main(String[] args){
        int a = 3;
        int b = 4;

        Test myTest = new Test();
        int c = myTest.sum(a, b);

        System.out.println(c);
        System.out.println(myTest.say());
        myTest.sum2(a, b);
        myTest.say2();
    }
}