package com.athc.mongo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("foo")
data class Foo(
    @Id
    var id: String?,
    val name: String,
    val createTime: Long
)