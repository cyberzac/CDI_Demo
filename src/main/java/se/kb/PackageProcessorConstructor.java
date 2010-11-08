package se.kb;

public class PackageProcessorConstructor {


    private final ArchiveService archiveService;

    /*
     * Default, with a  hardcoded dependency, not used in test...
     */
    public PackageProcessorConstructor() {
        archiveService  = new FeodoraArchiveService();
    }

    /**
     * This is for unit testing.
     */
    public PackageProcessorConstructor(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    public void processPackage(SIP sip) {
        AIP aip = sip.getAIP();
        archiveService.store(aip);
    }


}
