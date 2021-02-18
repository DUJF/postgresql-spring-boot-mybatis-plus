package com.athc.mongo.dao

import com.athc.mongo.domain.Foo
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository

@Repository
open class FooDao(
    private val mongoTemplate: MongoTemplate
) {

  fun insert(foo: Foo): Foo {
    return mongoTemplate.insert(foo)
  }
}