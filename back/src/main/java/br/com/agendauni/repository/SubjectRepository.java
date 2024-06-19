package br.com.agenda-uni.repository;

import br.com.agenda-uni.model.Course;
import br.com.agenda-uni.model.Subject;
import br.com.agenda-uni.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, UUID> {
    @Query(value = """
                    select t from Teacher t where t.teacherFirstName=:firstName and t.teacherLastName=:lastName
                    """)
    Teacher findTeacherByName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query(value = """
                   select c from Course c where c.courseName=:courseName
                   """)
    Course findCourseByName(@Param("courseName") String courseName);

}
