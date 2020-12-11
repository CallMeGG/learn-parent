package com.gyp.jedis.spring;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Description:
 * Company: 北京华宇元典信息服务有限公司
 *
 * @author GYP
 * @version 1.0
 */
public class FastJsonHttpMessageConverterCreator {

    public static FastJsonHttpMessageConverter get() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(
                SerializerFeature.WriteEnumUsingToString,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.QuoteFieldNames
        );

        fastJsonHttpMessageConverter.setFastJsonConfig(config);

        return fastJsonHttpMessageConverter;
    }
}
