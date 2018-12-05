package com.acoderx.design.mediator;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public class Dancer extends AbstractPartyMember {
    public void dance() {
        System.out.println(getName()+" is dancing");
        super.party.act(this, ActionType.DANCE);
    }

    @Override
    public String getName() {
        return "dancer";
    }
}
