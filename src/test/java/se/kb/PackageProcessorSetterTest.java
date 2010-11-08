package se.kb;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class PackageProcessorSetterTest {

    private PackageProcessorSetter dut;
    @Mock
    private ArchiveService archiveService;
    @Mock
    private SIP sip;
    @Mock
    private AIP aip;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        dut = new PackageProcessorSetter();
        dut.setArchiveService(archiveService); // How to test the default?
        when(sip.getAIP()).thenReturn(aip);
    }

    @Test
    public void testProcessPackage() throws Exception {
        dut.processPackage(sip);
        verify(archiveService).store(aip);
    }
}
