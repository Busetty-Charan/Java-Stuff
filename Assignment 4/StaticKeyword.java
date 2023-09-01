class Demo {

    public static int x = 0;

    Demo() {

        x++;
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        System.out.println("x variable in Demo class before objs : " + Demo.x);

        Demo obj1 = new Demo();

        System.out.println("x variable in Demo class after 1 obj : " + Demo.x);

        Demo obj2 = new Demo();

        System.out.println("X variable in Demo class after 2 objs : " + Demo.x);
    }
}
