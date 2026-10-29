package org.arham.spring_jpa_demo.Controller;

import org.arham.spring_jpa_demo.model.Student;
import org.arham.spring_jpa_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    StudentService studentService;

    @PostMapping
    public String addStudent(@RequestBody Student student){
       return  studentService.addStudent(student);

    }

    @PutMapping
    public String updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent()
    {
        return studentService.viewAllStudent();
    }

    @DeleteMapping("/{rollno}")
    public String deleteStudent(@PathVariable int rollno){
        return studentService.deleteStudent(rollno);
    }

    @GetMapping("/{rollno}")
    public Optional<Student> getStudentByRollNo(@PathVariable int rollno){
        return studentService.getStudentByRollNo(rollno);
    }

    @GetMapping("/Search/name")
    public List<Student> getStudentByName(@RequestParam String name)
    {
        return studentService.viewStudentByName(name);
    }

    @GetMapping("/Search/name/startwith")
    public List<Student> getStudentByNameStartsWith(@RequestParam String name)
    {
        return studentService.viewStudentByNameStartsWith(name);
    }

    @GetMapping("/maths/fail")
    public List<Student> viewStudentsFailInMaths()
    {
        return studentService.viewStudentFailInMaths();
    }

    @GetMapping("/maths/less/{marks}")
    public List<Student> viewStudentsLessThanInMaths(@PathVariable int marks)
    {
        return studentService.viewStudentByMathsLessThan(marks);
    }

    @GetMapping("/fail")
    public List<Student> viewStudentsFail()
    {
        return studentService.viewStudentFail();
    }

}
