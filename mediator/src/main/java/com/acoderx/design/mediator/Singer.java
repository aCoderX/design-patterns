package com.acoderx.design.mediator;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public class Singer extends AbstractPartyMember {
    public void sing() {
        System.out.println(getName()+" is singing");
        super.party.act(this,ActionType.SING);
    }
    @Override
    public String getName() {
        return "singer";
    }
}
