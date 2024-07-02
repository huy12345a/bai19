package classexample;

public class ClassExampleTest {
    private static ClassExample classExample;
    private static final String[] classname = new String[]{"C0223G", "A0323K"};
    private static final String[] classname2 = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classname : classname) {
            boolean check = classExample.checkClass(classname);
            System.out.println("name is : " + classname + ", ckeck1 : " + check);
        }
        for (String classname : classname2) {
            boolean check = classExample.checkClass(classname);
            System.out.println("name is : " + classname + ", ckeck2 : " + check);
        }
    }
}
