package com.jl.tdd

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertNotNull

class ThingSpek : Spek({
    describe("a thing") {
        val thing = FizzBuzz()

        it("should not be null") {
            assertNotNull(thing)
        }
    }
})
