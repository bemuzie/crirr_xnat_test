java -mx512m -classpath "/data/xnat/src/xnat-1.6.5/classes;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-1.6.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/nrg/jars/nrg-framework-1.6.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/nrg/jars/nrg-config-1.6.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/nrg/jars/nrg-mail-1.6.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/nrg/jars/nrg-notify-1.6.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-ldap-1.3.1.RELEASE-all.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.aop-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.asm-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.beans-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.context-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.context.support-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.core-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.expression-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.oxm-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.jdbc-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/org.springframework.transaction-3.0.7.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-security-core-3.0.8.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-security-config-3.0.8.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-security-ldap-3.0.8.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-security-openid-3.0.8.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/spring/jars/spring-security-web-3.0.8.RELEASE.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/aopalliance/jars/aopalliance-1.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-collections/jars/commons-collections-3.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-configuration/jars/commons-configuration-1.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-dbcp/jars/commons-dbcp-1.4.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-lang/jars/commons-lang-2.6.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-pool/jars/commons-pool-1.2.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/jakarta-regexp/jars/jakarta-regexp-1.2.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/slf4j/jars/slf4j-api-1.7.7.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/slf4j/jars/jul-to-slf4j-1.7.7.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/slf4j/jars/slf4j-log4j12-1.7.7.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/log4j/jars/log4j-1.2.17.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/postgresql/jars/postgresql-9.0-801.jdbc4.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/stratum/jars/stratum-1.0-b5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xerces/jars/xercesImpl-2.4.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xml-apis/jars/xml-apis-1.0.b2.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xerces/jars/xerces-J_1.4.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xalan/jars/xalan-2.5.1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/velocity/jars/velocity-1.7.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/jaxrpc/jars/jaxrpc-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/axis/jars/axis-1_3.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-logging/jars/commons-logging-1.0.4.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-discovery/jars/commons-discovery-0.2.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/saaj/jars/saaj-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/jaf/jars/activation-1.0.2.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/javamail/jars/javamail-1.4.3.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/PlexiViewer/jars/plexiviewer-1.6.1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-search-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-store-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-arcget-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-arcread-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-arcsim-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xdat-restClient-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/xdat/jars/xnat-data-client-1.6.5-jar-with-dependencies.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/ant/jars/ant-1.6.1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/ij/jars/ij-1.43u.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/srb/jars/jargon-1.4.25.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/srb/jars/xnatsrb-1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/mockito/jars/mockito-all-1.8.0.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/junit/jars/junit-4.3.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/json/jars/json-20090211.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-httpclient/jars/commons-httpclient-3.1.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-io/jars/commons-io-2.4.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-codec/jars/commons-codec-1.5.jar;/data/xnat/src/xnat-1.6.5/plugin-resources/repository/commons-email/jars/commons-email-1.2.jar" UpdateSQL -xdir /data/xnat/src/xnat-1.6.5   -url http://xnatdev.xnat.org  %*