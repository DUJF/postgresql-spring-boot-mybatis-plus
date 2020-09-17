package com.athc.shell

import com.athc.mybatis.entity.Goods
import com.athc.mybatis.mapper.GoodsMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal


/**
 * @author jjj
 * @date 2020/9/16
 * @since JDK1.8
 */
@RestController
@RequestMapping()
class TestController(
    private val mapper: GoodsMapper
) {

  @GetMapping("/test")
  fun test(): String {
    mapper.insert(Goods().apply {
      this.amount = BigDecimal.TEN
    })
    return ""
  }
}