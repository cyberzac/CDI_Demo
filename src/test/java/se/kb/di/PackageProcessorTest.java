package se.kb.di;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import se.kb.AIP;
import se.kb.ArchiveService;
import se.kb.SIP;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class PackageProcessorTest {
    private PackageProcessor dut;
    @Mock
    private ArchiveService archiveService;
    @Mock
    private SIP sip;
    @Mock
    private AIP aip;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        dut = new PackageProcessor(archiveService);
        when(sip.getAIP()).thenReturn(aip);
    }

    @Test
    public void testProcessPackage() throws Exception {
        dut.processPackage(sip);
        verify(archiveService).store(aip);
    }
}
