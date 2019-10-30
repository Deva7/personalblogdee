package com.BlogForDevlin.configuration;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Scanner;

/**
 * @program: personalblog
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/
public class MyBatisPlusGenerator {

    /*@Value("${DB.url}")
    static private String DBurl;*/
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://103.45.172.161:3306/blog_schema?nullCatalogMeansCurrent=true&useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        //dsc.setSchemaName("item");
        dsc.setUsername("root");
        dsc.setPassword("Alpha.1111");

        /*dsc.setTypeConvert(new MySqlTypeConvert() {
            @Override
            public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                System.out.println("转换类型：" + fieldType);
                //tinyint转换成Boolean
                if (fieldType.toLowerCase().contains("date")) {
                    return DbColumnType.DATE;
                }
                //将数据库中datetime转换成date
                if (fieldType.toLowerCase().contains("datetime")) {
                    return DbColumnType.DATE;
                }
                return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
            }
        });*/

        mpg.setDataSource(dsc);

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("Devlin-Kim");
        gc.setOpen(false);
        gc.setSwagger2(true);
        //gc.setActiveRecord(true);
        gc.setFileOverride(true);
//        gc.setServiceName("%sExt");
//        gc.setServiceImplName("%sExtImpl");
        mpg.setGlobalConfig(gc);


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.BlogForDevlin");
        pc.setEntity("Entity.DAO");
        pc.setMapper("Mapper.DAO");

        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        templateConfig.setEntity("Templates/entity.java");
        templateConfig.setMapper("Templates/mapper.java");
        templateConfig.setController(null);
        templateConfig.setService(null);
        templateConfig.setServiceImpl(null);
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setInclude(scanner("表名"));
        //strategy.setInclude("s_zhuxiang");

        strategy.setSuperEntityClass("com.baomidou.mybatisplus.extension.activerecord.Model");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //strategy.setSuperEntityColumns("gmt_create", "gmt_modified");

        strategy.setEntityLombokModel(true);
        strategy.setEntityTableFieldAnnotationEnable(true);

        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        //Boolean类型字段是否移除is前缀（默认 false）
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);

        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
