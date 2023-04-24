@Controller
@RequestMapping("/auditLog")
public class AuditLogController {

    @Autowired
    private AuditLogService auditLogService;
    private ManagementService managementService;

    @PostMapping
    public ResponseEntity<AuditLogDto> saveAuditLog(@RequestBody AuditLogDto auditLogDto) {
        if (auditLogService.validateAuditLogDto(auditLogDto)) {
            AuditLogDto savedAuditLogDto = auditLogService.saveAuditLog(auditLogDto);
            return ResponseEntity.ok(savedAuditLogDto);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/inject")
    public void injectManagementService(@RequestBody ManagementService managementService) {
        auditLogService.injectManagementService(managementService);
    }
}