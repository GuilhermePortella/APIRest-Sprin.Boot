package com.br.Payroll;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

/**
 *
 * @author Guilherme
 */
@Component
class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {
    
    public EntityModel<Employee> toModel(Employee employee) {
        return EntityModel.of(employee, linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(), 
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
        
    }   
}