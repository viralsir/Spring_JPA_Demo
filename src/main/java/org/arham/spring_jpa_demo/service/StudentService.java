package org.arham.spring_jpa_demo.service;

import org.arham.spring_jpa_demo.model.Student;
import org.arham.spring_jpa_demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{

    @Autowired
    StudentRepo studentRepo;

//    StudentService(StudentRepo stdrepo)
//    {
//        this.studentRepo=stdrepo;
//    }
//
    public String addStudent(Student student)
    {
            studentRepo.save(student);  // add or update
            return "Student Added Successfully";
    }

    public List<Student> viewAllStudent(){

        return studentRepo.findAll();

    }

    public List<Student> viewStudentByName(String name)
    {
        return studentRepo.findByName(name);
    }

    public List<Student> viewStudentByNameStartsWith(String criteria)
    {
        return studentRepo.findByNameStartsWith(criteria);
    }

    public Optional<Student> getStudentByRollNo(int rollno)
    {
        return  studentRepo.findById(rollno);
    }

    public String updateStudent(Student student)
    {
        studentRepo.save(student);
        return "Student Updated Successfully";
    }

    public String deleteStudent(int rollno){
         studentRepo.deleteById(rollno);
         return "Student Deleted Successfully";
    }

    public List<Student> viewStudentFailInMaths()
    {
        return studentRepo.findByMathsLessThan(35);
    }

    /*
       function : user define
       name : viewStudentsByMathsLessThan
       parameter : int marks
       Return type : List <Student>
       purpose : this function will return all students who's marks are less than given marks in maths.

     */
    public List<Student> viewStudentByMathsLessThan(int marks)
    {
            return studentRepo.findByMathsLessThan(marks);
    }

    public List<Student> viewStudentFail()
    {
        return studentRepo.findByMathsLessThanAndScienceLessThan(35,35);
    }
}
