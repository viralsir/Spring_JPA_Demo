package org.arham.spring_jpa_demo.repo;

import jakarta.persistence.OrderBy;
import jakarta.persistence.criteria.Order;
import org.arham.spring_jpa_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer>
{
    Student findByRollno(int rollno);

    List<Student> findByName(String name);

    List<Student> findByNameStartsWith(String criteria);

    List<Student> findByMathsLessThan(int marks);

    List<Student> findByMathsLessThanAndScienceLessThan(int matths_mark,int science_mark);

    List<Student> findByStandardStd(int std);

//    @Query("select * from student where math={{marks}}")
//    List<Student> viewMathsLessThan(int marks);


}
