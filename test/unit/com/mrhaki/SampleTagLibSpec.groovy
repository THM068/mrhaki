package com.mrhaki

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * Created by thandomafela on 20/09/2014.
 */
@TestFor(SampleTagLib)
class SampleTagLibSpec extends Specification {

    def 'sample test'() {
        expect:
             true
            //applyTemplate("<sample:sample />") == 42.0
    }
}
