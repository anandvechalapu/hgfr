@Service
public class AuditLogService {

    @Autowired
    private AuditLogControllerRepository auditLogControllerRepository;

    public AuditLogDto saveAuditLog(AuditLogDto auditLogDto) {
        return auditLogControllerRepository.saveAuditLog(auditLogDto);
    }

    public boolean validateAuditLogDto(AuditLogDto auditLogDto) {
        return auditLogControllerRepository.validateAuditLogDto(auditLogDto);
    }

    public void injectManagementService(ManagementService managementService) {
        auditLogControllerRepository.injectManagementService(managementService);
    }

}