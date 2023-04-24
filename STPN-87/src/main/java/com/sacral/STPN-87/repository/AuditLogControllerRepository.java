import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.STPN-87.model.AuditLogDto;

@Repository
public interface AuditLogControllerRepository extends JpaRepository<AuditLogDto, Long> {

    //Method to save audit logs
    AuditLogDto saveAuditLog(AuditLogDto auditLogDto);

    //Method to validate AuditLogDto object
    boolean validateAuditLogDto(AuditLogDto auditLogDto);

    //Method to inject ManagementService instance
    void injectManagementService(ManagementService managementService);

}