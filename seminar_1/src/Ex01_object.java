public class Ex01_object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 3.0));

        // int [] a = new int[] {1, 9};
        // int [] b = new int[3];
        // System.arraycopy(a, 0, b, 0, a.length);

        // for (int i : a) {System.out.printf("%d", i);} // 1 9
        // for (int j : b) {System.out.printf("%d", j);} // 0 9 00000000
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;
    }

}
