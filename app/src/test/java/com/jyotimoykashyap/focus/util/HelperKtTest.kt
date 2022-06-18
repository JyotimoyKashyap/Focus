package com.jyotimoykashyap.focus.util

import org.junit.Test


internal class HelperKtTest {

    @Test
    fun weekTest() {
        val value = getMilliSeconds(TimeInterval.WEEK)
        val actualValue = System.currentTimeMillis() - 24*60*60*1000*7
        assert(actualValue == value)
    }

    @Test
    fun dayTest() {
        val value = getMilliSeconds(TimeInterval.DAY)
        val actualValue = System.currentTimeMillis() - 24*60*60*1000
        assert(actualValue == value)
    }
}