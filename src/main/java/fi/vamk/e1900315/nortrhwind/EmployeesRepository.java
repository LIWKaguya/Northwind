package fi.vamk.e1900315.northwind;

import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {
}