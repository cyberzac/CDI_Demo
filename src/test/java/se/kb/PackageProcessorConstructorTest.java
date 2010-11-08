package se.kb;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class PackageProcessorConstructorTest {

    private PackageProcessorConstructor dut;
    @Mock
    private ArchiveService archiveService;
    @Mock
    private SIP sip;
    @Mock
    private AIP aip;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        dut = new PackageProcessorConstructor(archiveService);
        // How to test the default constructor?
        when(sip.getAIP()).thenReturn(aip);
    }

    @Test
    public void testProcessPackage() throws Exception {
        dut.processPackage(sip);
        verify(archiveService).store(aip);
    }
}
