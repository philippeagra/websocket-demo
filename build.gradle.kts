plugins {
	id("org.springframework.boot") version "2.6.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	java
}

group = "com.ekino"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-websocket") {
		exclude(module = "spring-boot-starter-tomcat")
	}
	implementation("org.springframework.boot:spring-boot-starter-jetty")


	implementation("org.webjars:webjars-locator-core")
	implementation("org.webjars:sockjs-client:1.5.1")
	implementation("org.webjars:stomp-websocket:2.3.4")
	implementation("org.webjars:bootstrap:5.1.1")
	implementation("org.webjars:jquery:3.6.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
	useJUnitPlatform()
}
