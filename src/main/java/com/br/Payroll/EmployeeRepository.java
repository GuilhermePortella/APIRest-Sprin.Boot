package com.br.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Guilherme
 */
interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
    
}
