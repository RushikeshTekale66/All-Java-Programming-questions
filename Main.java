class Main {
    public static void main(String[] args) {
        int[] arr = { 11, 33, 55, 44, 22, 66 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is " + max);
    }
}