package Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray ha = new HighArray(10);
        ha.insert(134);
        ha.insert(523);
        ha.insert(823);
        ha.insert(362);
        ha.insert(583);

        ha.delete(823);
        System.out.println(ha.find(823));
        System.out.println(ha.showSize());
        ha.display();
    }
}
