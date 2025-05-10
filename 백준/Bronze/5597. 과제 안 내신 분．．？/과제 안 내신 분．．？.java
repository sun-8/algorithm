import java.io.*;
import java.util.*;

public class Main {
    // 실행부부
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Service service = new Service();
        String result = service.findNonSubmitStudent(30, 28);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}

// 과제 미제출자를 찾는 프로그램
class Service {
    StudentManager studentManager;

    public String findNonSubmitStudent(int studentCount, int submitCount) {
        studentManager = new StudentManager(studentCount, submitCount);
        Set<Integer> submitSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 제출자 입력
            for (int i=0; i<studentManager.getSubmitCount(); i++) {
                submitSet.add(Integer.parseInt(br.readLine()));
            }
            // 미제출자 탐색
            for (int i=1; i<=studentManager.getStudentCount(); i++) {
                if (!submitSet.contains(i)) {
                    sb.append(i).append("\n");
                }
            }
            studentManager.setNonSubmitStudent(String.valueOf(sb));
        } catch (IOException e) {
            e.getMessage();
        }
        return studentManager.getNonSubmitStudent();
    }

}

// 학생 관리 (학생 수, 과제 제출자 수, 미제출자)
class StudentManager {
    private int studentCount;
    private int submitCount;
    private String nonSubmitStudent;

    public StudentManager() {}
    public StudentManager(int studentCount, int submitCount) {
        this.studentCount = studentCount;
        this.submitCount = submitCount;
    }

    public void studentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setSubmitCount(int submitCount) {
        this.submitCount = submitCount;
    }
    public int getSubmitCount() {
        return submitCount;
    }
    public void setNonSubmitStudent(String nonSubmitStudent) {
        this.nonSubmitStudent = nonSubmitStudent;
    }
    public String getNonSubmitStudent() {
        return nonSubmitStudent;
    }

}