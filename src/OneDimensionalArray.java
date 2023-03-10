public class OneDimensionalArray {

    public static void main(String[] args) {

        // declaration, initialization and assignment
        int[] studentMarks = {90, 100, 75, 80, 98};

//        System.out.println(studentMarks[1]);

        // Fast Food Center
        String[] menu = new String[4];
        menu[0] = "Pizza";
        menu[1] = "Pasta";

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
}