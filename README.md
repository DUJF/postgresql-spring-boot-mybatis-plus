# postgresql-spring-boot-mybatis-plus
postgresql 数据库使用mybatis-plus 

##注意事项
1. 设置数据源类型时修改 数据库类型
        `// 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.POSTGRE_SQL);`
2. 使用分叶插件时需要修改拦截的数据库类型,postgresql分页与mysql有一点差别，limit 1 offset 1
  ```java
  /**
     * mybatis-plus 分页插件
     */

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
       `page.setDialectType("postgresql");`
        return page;
    }
 ```
