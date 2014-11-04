package com.mrhaki

/**
 * Created by thandomafela on 14/10/2014.
 */
class EmailService {

    def emailMe(String name) {
        File f = new File("/Users/thandomafela/workspace/grails/mrhaki/test.txt")

        f << "I have been emailed by $name"
    }
}
