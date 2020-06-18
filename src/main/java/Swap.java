public class Swap {
    public static void swapNative (int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swapObject (Bag x, Bag y){
        Integer temp = x.value;
        x.value = y.value;
        y.value = temp;
    }

    static class Bag {
        Integer value = 0;
        Bag(Integer value) {
            this.value = value;
        }
    }
}
