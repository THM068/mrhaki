package com.mrhaki

/**
 * Created by thandomafela on 14/10/2014.
 */
class Address {

    String addressLine1
    String addressLine2
    String email
    String homePhone
    String mobilePhone

    String county
    String town
    String postCode

    Date dateCreated

    static constraints = {
        addressLine1(nullable: true)
        addressLine2(nullable: true)
        email(nullable: true)
        homePhone(nullable: true)
        mobilePhone(nullable: true)
        county(nullable: true)
        town(nullable: true)
        postCode(nullable: true)
        dateCreated(nullable: true)

    }

}
