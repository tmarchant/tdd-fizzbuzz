package com.jl.tdd

import spock.lang.Specification

class ThingSpec extends Specification {

    def "thing should not be null"() {
        given:
        def thing = new FizzBuzz()

        expect:
        thing == null
    }
}
