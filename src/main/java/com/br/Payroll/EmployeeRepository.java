package com.br.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Guilherme
 */
interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
}
