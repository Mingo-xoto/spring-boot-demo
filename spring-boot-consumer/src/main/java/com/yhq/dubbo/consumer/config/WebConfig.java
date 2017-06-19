//package com.yhq.dubbo.consumer.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
//import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;
//
//@Configuration
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/default").setViewName("default");
//	}
//
//	/**
//	 * 视图解析器
//	 */
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		registry.jsp("/jsp/", ".jsp");
//		// 启用内容裁决视图解析器
//		registry.enableContentNegotiation(new MappingJackson2JsonView(), new MappingJackson2XmlView());
//	};
//
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		/* 是否通过请求Url的扩展名来决定media type */
//		configurer.favorPathExtension(true)
//				/* 不检查Accept请求头 */
//				.ignoreAcceptHeader(true)
//				/* 请求类型参数名称 */
//				.parameterName("mediaType")
//				/* 设置默认的media yype */
//				.defaultContentType(MediaType.TEXT_HTML)
//				/* 请求以.html结尾的会被当成MediaType.TEXT_HTML */
//				.mediaType("html", MediaType.TEXT_HTML)
//				/* 请求以.xml结尾的会被当成MediaType.APPLICATION_XML */
//				.mediaType("xml", MediaType.APPLICATION_XML)
//				/* 请求以.json结尾的会被当成MediaType.APPLICATION_JSON */
//				.mediaType("json", MediaType.APPLICATION_JSON);
//	}
//}
