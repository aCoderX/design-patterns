package com.acoderx.design.mediator;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public interface Party {
    void addMember(PartyMember member);

    void act(PartyMember member, ActionType actionType);
}
