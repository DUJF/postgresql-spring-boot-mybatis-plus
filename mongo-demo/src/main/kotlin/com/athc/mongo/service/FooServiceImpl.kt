package com.athc.mongo.service

import com.athc.common.constant.ErrorCode
import com.athc.mongo.domain.Foo
import com.athc.common.exception.BizException
import com.athc.mongo.dao.FooDao
import org.apache.commons.lang3.StringUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class FooServiceImpl(
    private val fooDao: FooDao

) : FooService {

  private val logger: Logger = LoggerFactory.getLogger(FooServiceImpl::class.java);

  override fun create(foo: Foo): Boolean {
    if (StringUtils.isEmpty(foo.name)) {
      throw  BizException(ErrorCode.FOO_NOT_FOUND, "我要原始异常信息")
    }
    fooDao.insert(foo)
    return true
  }

  override fun list(): List<Foo> {
    TODO("Not yet implemented")
  }

  override fun detail(id: String): Foo {
    TODO("Not yet implemented")
  }

  override fun update(foo: Foo): Boolean {
    TODO("Not yet implemented")
  }

  override fun delete(id: String): Boolean {
    TODO("Not yet implemented")
  }

}