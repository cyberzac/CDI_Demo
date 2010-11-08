package se.kb.di;

import se.kb.AIP;
import se.kb.ArchiveService;
import se.kb.SIP;

import javax.inject.Inject;

public class PackageProcessor {

    private final ArchiveService archiveService;

    public @Inject PackageProcessor(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    public void processPackage(SIP sip) {
        AIP aip = sip.getAIP();
        archiveService.store(aip);
    }

}
