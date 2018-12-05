package com.acoderx.design.mediator;

/**
 * Description:中介者模式
 *
 * @author xudi
 * @since 2018-12-05
 */
public class Client {
    public static void main(String[] args){
        Dancer dancer = new Dancer();
        Singer singer = new Singer();
        Guest guest = new Guest();

        Party party = new PartyImpl();
        party.addMember(dancer);
        party.addMember(singer);
        party.addMember(guest);

        dancer.dance();
        singer.sing();

    }
}
