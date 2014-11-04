package com.mrhaki

/**
 * Created by thandomafela on 14/10/2014.
 */
class Membership {

    Date dateBaptised
    String baptismOfficiant
    boolean isBaptised = false
    boolean baptisedInBelfast = false
    String  placeBaptised

    String status
    boolean transferIn
    boolean transferOut

    Date dateCreated
    Date dateOfLastVisit
    String notes
    String reasonForNotAttending

    static belongsTo = [ person: Person ]

    static constraints = {
        dateBaptised(nullable: true)
        baptismOfficiant(nullable: true)
        isBaptised(nullable: true)
        baptisedInBelfast(nullable: true)
        placeBaptised(nullable: true, maxSize: 2000)
        transferIn(nullable: true)
        transferOut(nullable: true)
        status(nullable: true)
        dateCreated(nullable: true)
        notes(nullable: true)
        reasonForNotAttending(nullable: true, maxSize: 5000)
        dateOfLastVisit(nullable: true)
    }

    static mapping = {
        notes type: "text"
    }

}
