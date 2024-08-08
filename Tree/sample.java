import java.util.LinkedList;

class sample{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.addFirst("Yellow");
        colors.addLast("Purple");
        colors.set(2, "green");

        System.out.println(colors);
    }
}