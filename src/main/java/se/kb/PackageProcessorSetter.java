package se.kb;

public class PackageProcessorSetter {

    // Hardcoded dependency
    private  ArchiveService archiveService = new FeodoraArchiveService();

    public void processPackage(SIP sip) {
        AIP aip = sip.getAIP();
        archiveService.store(aip);
    }

    /*
     * This is for unit testing and archiveService can not be final anymore
     */
    public void setArchiveService(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }
}
