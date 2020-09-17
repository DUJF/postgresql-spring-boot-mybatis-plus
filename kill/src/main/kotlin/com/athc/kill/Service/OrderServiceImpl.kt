package com.athc.kill.Service

import com.athc.mybatis.mapper.GoodsMapper
import com.athc.mybatis.mapper.GoodsOrderMapper
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class OrderServiceImpl(
    private val goodsMapper: GoodsMapper,
    private val orderMapper: GoodsOrderMapper
) : OrderService {
  /**
   * 下单
   *
   */
  override fun createOrder(goodsId: Long, quantity: BigDecimal): Boolean {
    goodsMapper.selectList(QueryWrapper())
    TODO("Not yet implemented")
  }
}