package se.kb;


public class ArchiveServiceFactory {

    private static ArchiveService instance = new FeodoraArchiveService();


    public static ArchiveService getInstance() {
        return instance;
    }

    /*
     * This is need for test...
     */
    public static void setInstance(ArchiveService instance) {
        ArchiveServiceFactory.instance = instance;
    }
}
