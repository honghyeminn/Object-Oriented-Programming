import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력받을 정수의 개수
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        // 2. 배열 크기를 입력받은 개수로 지정하고, 공백으로 구분된 정수 저장
        int[] arr = new int[n];
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 최대값/최소값을 배열의 0번째 요소로 초기화
        int max = arr[0];
        int min = arr[0];

        // 4. 나머지 요소와 비교하며 갱신
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 5. 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        sc.close();
    }
}
