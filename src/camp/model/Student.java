package camp.model;

import java.util.Arrays;

public class Student {
    private String studentId; // 고유번호
    private String studentName; // 이름
    private String studentStatus; // 상태
    private String[] studentSubjects = new String[9]; // 선택 과목 목록

    // 생성자
    public Student() {
    }

    public Student(String studentId, String studentName, String studentStatus, String[] studentSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentStatus = studentStatus;
        this.studentSubjects = studentSubjects;
    }

    // 출력 메소드
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                ", studentSubjects=" + Arrays.toString(studentSubjects) +
                "}\n";
    }

    // getter
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public String[] getStudentSubjects() {
        return studentSubjects;
    }

    // setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public void setStudentSubjects(String[] studentSubjects) {
        this.studentSubjects = studentSubjects;
    }
}