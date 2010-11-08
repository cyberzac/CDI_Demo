package se.kb.di;

import se.kb.AIP;
import se.kb.SIP;

import javax.inject.Inject;


public class KbSip implements SIP {


    private final AIP aip;

    @Inject
    public KbSip(AIP aip) {
        this.aip = aip;
    }

    @Override
    public AIP getAIP() {
        return aip;
    }

}
