package com.athc.common.exception

import java.lang.RuntimeException

/**
 * @author jjj
 * @date 2020/8/25
 * @since JDK1.8
 */
class BaseException(
    val errorCode: String = "",
    override val message: String = "",
    throwable: Throwable? = null
) : RuntimeException(message, throwable)