jenkins-build:
	docker-compose -f docker-compose.yml build jenkins

jenkins-start:
	docker-compose -f docker-compose.yml up -d jenkins

jenkins-stop:
	docker-compose -f docker-compose.yml stop jenkins

spring-boot-mysql-build:
	docker-compose -f docker-compose.yml build spring-boot-mysql	

spring-boot-mysql-start:
	docker-compose -f docker-compose.yml up -d --force-recreate spring-boot-mysql
	java -jar target/spring-boot-mysql-0.0.1-SNAPSHOT.jar

spring-boot-mysql-push:
	docker-compose -f docker-compose.yml push spring-boot-mysql

spring-boot-app-stop:
	docker-compose -f docker-compose.yml stop spring-boot-mysql

stop-all:
	docker-compose -f docker-compose.yml stop
