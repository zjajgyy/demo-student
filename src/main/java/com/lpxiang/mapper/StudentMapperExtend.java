package com.lpxiang.mapper;

import com.lpxiang.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static org.apache.ibatis.type.JdbcType.*;

/**
 * Created by lipx on 2016/1/26.
 */
public interface StudentMapperExtend {


    @Select({"select * from student"})
    @Results( value = {
            @Result(column = "id", property = "id", jdbcType = INTEGER),
            @Result(column = "name", property = "name", jdbcType = VARCHAR),
            @Result(column = "age", property = "age", jdbcType = INTEGER),
            @Result(column = "class_id", property = "classId", jdbcType = INTEGER)
    })
    List<Student> findAllStudents();

    @Insert({
            "insert into student(id, name, age, class_id)",
            "values(#{id, jdbcType=INTEGER}, #{name, jdbcType=VARCHAR}, #{age, jdbcType=INTEGER}, #{classId, jdbcType=INTEGER})"
    })
    @SelectKey( keyProperty = "id", statement="SELECT LAST_INSERT_ID()", before = false, resultType = Integer.class)
    int insert(Student s);

    @Delete({
            "delete from student",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteById(@Param("id") Integer id);
}
