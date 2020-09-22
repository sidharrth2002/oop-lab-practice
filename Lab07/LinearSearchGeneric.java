public class LinearSearchGeneric {
    public static void main(String[] args) {
        String[] list = {"abstract", "final", "private", "protected", "public", "static", "super", "this"};
        int found = linearSearch(list, "fsd");
        if (found!=-1) {
            System.out.println("Found at " + found);
        } else {
            System.out.println("Not found");
        }
    }
    public static<E> int linearSearch (E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key)
                return i;
        }
        return -1;
    }
}
