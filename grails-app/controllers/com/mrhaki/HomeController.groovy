package com.mrhaki

/**
 * Created by thandomafela on 20/09/2014.
 */
class HomeController {


    def index() {
        def val = params.double('v', 45)
        [ val: val ]
    }
}
