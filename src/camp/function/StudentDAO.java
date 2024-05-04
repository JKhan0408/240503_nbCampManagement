package camp.function;

import camp.model.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentDAO {
    // 스캐너
    private static Scanner sc = new Scanner(System.in);

    // 고유번호 부여
    InitializeData initializeData = new InitializeData();

    // 수강생 등록
    public void createStudent() {
        String studentID = initializeData.sequence(InitializeData.INDEX_TYPE_STUDENT);
        String studentName = " ";
        String studentStatus = " ";
        LinkedList<String> studentSubjects = new LinkedList<>();
        String[] mandatorySubjects = new String[]{"Java", "객체지향", "Spring", "JPA", "MySQL"}; // 최소 3개 이상
        String[] choiceSubjects = new String[]{"디자인 패턴", "Spring Security", "Redis", "MongoDB"}; // 최소 2개 이상
        int count = 0;

        // 기능 구현 (필수 과목, 선택 과목)

        Student student = new Student(studentID, studentName, studentStatus, studentSubjects); // 수강생 인스턴스 생성 예시 코드
        // 기능 구현
        System.out.println("수강생 등록 성공!\n");
    }

    // 수강생 목록 조회
    public void inquireStudent() {
        System.out.println("\n수강생 목록을 조회합니다...");
        // 기능 구현
        System.out.println("\n수강생 목록 조회 성공!");
    }
}
