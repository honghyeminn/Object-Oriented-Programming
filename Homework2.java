import java.util.Scanner;

class Student {
    private int id;        // 학번 (숫자)
    private String name;   // 이름 (문자열)
    private String major;  // 전공 (문자열)
    private long phone;    // 전화번호 (숫자, 맨 앞 0은 저장되지 않음)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class Homework2 {

    // 숫자로 저장된 전화번호에 앞자리 0을 복구하고 하이픈을 삽입
    // 예: 1053559999 -> "01053559999" -> "010-5355-9999"
    static String formatPhone(long phone) {
        String s = "0" + Long.toString(phone);
        if (s.length() == 11) {
            return s.substring(0, 3) + "-" + s.substring(3, 7) + "-" + s.substring(7);
        } else if (s.length() == 10) {
            return s.substring(0, 3) + "-" + s.substring(3, 6) + "-" + s.substring(6);
        }
        return s; // 예상 밖의 길이는 그대로 출력
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = Integer.parseInt(scanner.next());
            String name = scanner.next();
            String major = scanner.next();
            long phone = Long.parseLong(scanner.next()); // "010..." -> 앞의 0이 사라짐

            students[i] = new Student();
            students[i].setId(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println((i + 1) + "번째 학생: " + Integer.toString(s.getId()) + " "
                    + s.getName() + " " + s.getMajor() + " " + formatPhone(s.getPhone()));
        }

        scanner.close();
    }
}
