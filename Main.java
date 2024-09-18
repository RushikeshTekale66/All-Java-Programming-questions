import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][][] arr = new int[2][2][2];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                        System.out.print("Enter the element for next position");
                        arr[i][j][k] = sc.nextInt();
                }
            }
        }

        //Print array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}