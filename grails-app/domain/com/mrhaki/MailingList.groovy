package com.mrhaki

/**
 * Created by thandomafela on 14/10/2014.
 */
class MailingList {

    boolean subscribedToMessengerList = false
    boolean subscribedToEncounterList = false
    boolean subscribedToDialogList = false
    boolean subscribedFreeBibleList = false
    boolean subscribedToContactList = false

    Date dateCreated
    Date lastUpdated

    static belongsTo = [ person: Person ]

    static constraints = {
        subscribedToMessengerList(nullable: true)
        subscribedToEncounterList(nullable: true)
        subscribedToDialogList(nullable: true)
        subscribedFreeBibleList(nullable: true)
        subscribedToContactList(nullable: true)
        dateCreated(nullable: true)
        lastUpdated(nullable: true)
    }
}
