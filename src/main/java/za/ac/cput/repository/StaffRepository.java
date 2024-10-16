package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff,String> {

boolean existsByNameAndEmployeeIdAndEmployeeRoleAndPassword(String name, String id, String role, String password);

boolean existsByEmployeeIdAndPassword(String employeeId, String password);

Staff findByEmployeeIdAndPassword(String employeeId, String password);


}
