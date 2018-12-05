package com.acoderx.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public class PartyImpl implements Party {
    List<PartyMember> members = new ArrayList<>();
    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember member, ActionType actionType) {
        for (PartyMember partyMember : members) {
            if(!partyMember.equals(member)){
                switch (actionType) {
                    case SING:
                        System.out.println(partyMember.getName()+" come to listen");
                        break;
                    case DANCE:
                        System.out.println(partyMember.getName()+" come to see");
                }
            }
        }
    }
}
