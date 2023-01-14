package com.example.student;

import com.example.student.bean.StudentVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public int insertStudent(StudentVO vo);
    public int deleteStudent(int seq);
    public int updateStudent(StudentVO vo);
    public StudentVO getStudent(int seq);
    public List<StudentVO> getStudentList();
}
