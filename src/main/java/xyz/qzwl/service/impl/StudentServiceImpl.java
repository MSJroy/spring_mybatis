package xyz.qzwl.service.impl;

import xyz.qzwl.dao.StudentDao;
import xyz.qzwl.domain.Student;
import xyz.qzwl.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //定义Dao的引用类型的属性
    private StudentDao studentDao;

    //为了设值注入
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int modifyStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int removeStudent(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public Student findStudentById(int id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentDao.selectAllStudents();
    }
}
