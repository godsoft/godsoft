<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:jee="http://www.springframework.org/schema/jee"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
	http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-2.5.xsd
	http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-2.5.xsd">
	
	<jee:jndi-lookup id="a" jndi-name="b" resource-ref="true">
	     <jee:environment>
		  java.naming.factory.initial=c
		  java.naming.provider.url=d
	    </jee:environment>
	</jee:jndi-lookup>

</beans>