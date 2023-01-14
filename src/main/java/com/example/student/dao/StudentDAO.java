package com.example.student.dao;

import com.example.student.bean.StudentVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertStudent(StudentVO vo) {
        int result = sqlSession.insert("Student.insertStudent", vo);
        return result;
    }
    public int deleteStudent(int id){
        return sqlSession.delete("Student.deleteStudent", id);
    }
    public int updateStudent(StudentVO vo) {
        int result = sqlSession.update("Student.updateStudent", vo);
        return result;
    }
    public StudentVO getStudent(int seq) {
        StudentVO one = sqlSession.selectOne("Student.getStudent", seq);
        return one;
    }
    public List<StudentVO> getStudentList(){
        List<StudentVO> list = sqlSession.selectList("Student.getStudentList");
        return list;
    }
}
