package com.yo1000.oreore.security

/**
 *
 * @author yo1000
 */
class OperatorContainer {
    companion object {
        private val threadLocal: ThreadLocal<Operator> = ThreadLocal()
    }
}