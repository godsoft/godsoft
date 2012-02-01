<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
  
	<bean id="ehcache" class="org.springframework.cache.ehcache.EhCacheFactoryBean">
	    <property name="cacheManager">
	        <bean class="org.springframework.cache.ehcache.EhCacheManagerFactoryBean">
	            <property name="configLocation" value="classpath:/ehcache-default.xml"/>
	        </bean>
	    </property>    
	</bean>
	
</beans>