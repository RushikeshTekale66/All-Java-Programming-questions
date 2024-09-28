class Main {
    public static void main(String[] args) {
        int[] arr = { 11, 33, 55, 44, 22, 66 };

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min element is " + min);
    }
}