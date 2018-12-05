package com.acoderx.design.mediator;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public abstract class AbstractPartyMember implements PartyMember {
    protected Party party;

    public void joinParty(Party party) {
        this.party = party;
    }

}
