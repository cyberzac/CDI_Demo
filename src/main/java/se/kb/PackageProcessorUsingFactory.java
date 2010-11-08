package se.kb;

public class PackageProcessorUsingFactory {

    // Static dependency on the ArchiveServiceFactory
    ArchiveService archiveService = ArchiveServiceFactory.getInstance();

    public void processPackage(SIP sip) {
        AIP aip = sip.getAIP();
        archiveService.store(aip);
    }
    
    // This is for unit testing
    public void setArchiveService(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }
}
