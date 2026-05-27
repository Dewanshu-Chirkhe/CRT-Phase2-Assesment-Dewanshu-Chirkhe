package com.post.test.repository;

import com.post.test.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Q9: Repository demonstrates SQL and JPQL ways to find the second highest salary.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /*
     Plain SQL idea:
     SELECT MAX(salary)
     FROM employee
     WHERE salary < (SELECT MAX(salary) FROM employee);

     The inner query finds the highest salary.
     The outer query finds the highest salary below that value, so it is second highest.
    */

    @Query("select max(e.salary) from Employee e where e.salary < (select max(emp.salary) from Employee emp)")
    Double findSecondHighestSalary();
}
