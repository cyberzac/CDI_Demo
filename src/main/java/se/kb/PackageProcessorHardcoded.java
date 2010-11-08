package se.kb;

public class PackageProcessorHardcoded {

    // Hardcoded dependency
    private final ArchiveService archiveService = new FeodoraArchiveService();

    public void processPackage(SIP sip) {
        AIP aip = sip.getAIP();
        archiveService.store(aip);
    }

}
