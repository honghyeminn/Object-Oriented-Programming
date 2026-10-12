import java.util.Scanner;

class Homework4 {

    // 재귀 버전
    // 1. 두 정수 m, n을 매개변수로 받음
    // 2. n이 0이면 m을 반환하고 종료
    // 3. 첫 번째 인자로 작은 수, 두 번째 인자로 (큰 수 % 작은 수)를 넣어 다시 호출
    int gcd(int m, int n) {
        if (n == 0) {
            return m;                          // 종료 조건
        }
        int small = (m < n) ? m : n;
        int big = (m < n) ? n : m;
        return gcd(small, big % small);        // 자기 자신을 다시 호출
    }

    // 반복문 버전
    // 같은 클래스에 int gcd(int, int)가 이미 있어서 이름만 다르게 함
    // (매개변수가 같고 이름도 같으면 컴파일 에러)
    int gcdLoop(int m, int n) {
        while (n != 0) {                       // 재귀의 종료 조건(n == 0)의 반대
            int small = (m < n) ? m : n;
            int big = (m < n) ? n : m;
            m = small;                         // 재귀 호출의 첫 번째 인자 자리
            n = big % small;                   // 재귀 호출의 두 번째 인자 자리
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Homework4 h = new Homework4();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", h.gcd(a, b));

        // 반복문 버전 확인용 (결과가 같아야 함)
        // System.out.printf("두 수의 최대공약수는 %d입니다.\n", h.gcdLoop(a, b));
    }
}
