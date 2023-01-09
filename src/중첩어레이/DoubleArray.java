package 중첩어레이;
// 2차원 배열에 대해서
//
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }
        for(int[] row : arr) {
            for(int e : row) System.out.print(e + " ");
            System.out.println();
        }
            /*for (int i = 0; i < arr.length; i++) { // 행의 갯수 알 수 있다
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j] + " ");
                }
            }*/
        }
    }
