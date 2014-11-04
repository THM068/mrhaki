package com.mrhaki

/**
 * Created by thandomafela on 14/10/2014.
 */
class Person {

    String title
    String firstName
    String lastName
    String maidenName
    Date dateOfBirth
    String nationality

    Date dateCreated
    Date lastUpdated

    Address address

    static hasOne = [  mailingList: MailingList, membership: Membership ]

    static constraints = {
        title(nullable: false)
        firstName(nullable: false)
        lastName(nullable: false)
        maidenName(nullable: true)
        dateOfBirth(nullable: true)
        address(nullable: true)
        dateCreated(nullable: true)
        lastUpdated(nullable: true)
    }
}
