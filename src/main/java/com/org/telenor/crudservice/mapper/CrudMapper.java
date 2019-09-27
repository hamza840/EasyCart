package com.org.telenor.crudservice.mapper;


import com.org.telenor.crudservice.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * MyBatis mapper for crud operations in database
 */


@Mapper
public interface CrudMapper {
    @Select("select * from employee")
    ArrayList<Employee> getAll();

    @Insert("insert into employee (first_name,last_name,salary)"+
            "values(#{firstName},#{lastName},#{salary})")
    public int insert(Employee employee);

    @Update("update employee set first_name=#{firstName},last_name=#{lastName},salary=#{salary} where id=#{id}")
    public int update(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public int delete(Employee employee);
}
