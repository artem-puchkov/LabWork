package LabWork20;

public class Task2 {
    public static void main(String[] args) {
        Generic<Integer, String, Double> generic = new Generic<>(14, "Hello", 2.5);

        generic.printAllFields();
    }

    static class Generic<T, V, K> {
        T t;
        V v;
        K k;

        public Generic(T t, V v, K k) {
            this.t = t;
            this.v = v;
            this.k = k;
        }

        public void printAllFields() {
            System.out.println(t.getClass().getName() + ": " + t);
            System.out.println(v.getClass().getName() + ": " + v);
            System.out.println(k.getClass().getName() + ": " + k);
        }
    }
}
