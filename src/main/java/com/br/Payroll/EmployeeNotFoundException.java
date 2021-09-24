package com.br.Payroll;

/**
 *
 * @author Guilherme
 */
public class EmployeeNotFoundException extends RuntimeException{
    
    EmployeeNotFoundException(Long id){
        super("Could not find employee " + id);
    }
}
