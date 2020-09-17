package com.athc.kill

import com.athc.kill.Service.OrderService
import com.athc.kill.config.KillAutoConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.math.BigDecimal

@SpringBootTest(classes = [KillAutoConfig::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class)
class KillApplicationTests(
    @Autowired
    private val orderService: OrderService

) {

  @Test
  fun contextLoads() {
    orderService.createOrder(1, BigDecimal.ONE)
  }

}
