public class JavaCoreHomeWork3 {
    public static void main(String[] args) {
        Integer [] arr1 = new Integer []{1,2,3,4};
        String [] arr2 = new String[]{"5","6","7"};

        BoxWithElements box1 = new BoxWithElements(arr1);
        BoxWithElements box2 = new BoxWithElements(arr2);

        System.out.println("Box1 = " + box1);
        System.out.println("box1.swap(1,4)");
        box1.swap(1,4);
        System.out.println("Box1 = " + box1 + "\n");

        System.out.println("Box1 = " + box1);
        System.out.println("box1.swap(2,5)");
        box1.swap(2,5);
        System.out.println("Box1 = " + box1 + "\n");

        System.out.println("Box2 = " + box2);
        System.out.println("box2.swap(1,3)");
        box2.swap(1,3);
        System.out.println("Box2 = " + box2 + "\n");

        System.out.println("Box2 = " + box2);
        System.out.println("box2.swap(-2,3)");
        box2.swap(-2,3);
        System.out.println("Box2 = " + box2 + "\n");

        Apple apple = new Apple();
        Orange orange = new Orange();
        Fruit fruit = new Fruit();

        FruitBox fb1 = new FruitBox(fruit,10);
        System.out.println("FruitBox1 = " + fb1);

        FruitBox fb2 = new FruitBox(apple,5);
        System.out.println("FruitBox2 = " + fb2);

        FruitBox fb3 = new FruitBox(orange,5);
        System.out.println("FruitBox3 = " + fb3 + "\n");

        System.out.println("Does the FruitBox1 and FruitBox2 have the same weight? " + fb1.compare(fb2));
        System.out.println("Does the FruitBox2 and FruitBox3 have the same weight? " + fb2.compare(fb3));
        System.out.println("Does the FruitBox1 and FruitBox3 have the same weight? " + fb1.compare(fb3) + "\n");

        System.out.println("FruitBox1 = " + fb1);
        System.out.println("FruitBox2 = " + fb2);
        System.out.println("fb1.moveTo(fb2)");
        fb1.moveTo(fb2);
        System.out.println("FruitBox1 = " + fb1);
        System.out.println("FruitBox2 = " + fb2 + "\n");


        System.out.println("FruitBox2 = " + fb2);
        FruitBox fb4 = new FruitBox(apple,2);
        System.out.println("FruitBox4 = " + fb4);
        System.out.println("fb2.moveTo(fb4)");
        fb2.moveTo(fb4);
        System.out.println("FruitBox2 = " + fb2);
        System.out.println("FruitBox4 = " + fb4 + "\n");

        System.out.println("FruitBox3 = " + fb3);
        FruitBox fb5 = new FruitBox(orange,1);
        System.out.println("FruitBox5 = " + fb5);
        System.out.println("fb3.moveTo(fb5)");
        fb3.moveTo(fb5);
        System.out.println("FruitBox3 = " + fb3);
        System.out.println("FruitBox5 = " + fb5 + "\n");

        FruitBox fb6 = new FruitBox(apple,0);
        System.out.println("FruitBox6 = " + fb6);
        System.out.println("FruitBox4 = " + fb4);
        System.out.println("fb6.moveTo(fb4)");
        fb6.moveTo(fb4);
        System.out.println("FruitBox6 = " + fb6);
        System.out.println("FruitBox4 = " + fb4 + "\n");

        System.out.println("FruitBox4 = " + fb4);
        System.out.println("FruitBox6 = " + fb6);
        System.out.println("fb4.moveTo(fb6)");
        fb4.moveTo(fb6);
        System.out.println("FruitBox4 = " + fb4);
        System.out.println("FruitBox6 = " + fb6 + "\n");

    }
}
