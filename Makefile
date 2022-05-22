jenkins-build:
	docker-compose -f docker-compose.yml build jenkins

jenkins-start:
	docker-compose -f docker-compose.yml up -d jenkins

jenkins-stop:
	docker-compose -f docker-compose.yml stop jenkins

spring-boot-app-build:
	docker-compose -f docker-compose.yml build spring-boot-app
	mvn package	

spring-boot-app-start:
	docker-compose -f docker-compose.yml up -d --force-recreate spring-boot-app
	java -jar target/spring-boot-with-docker-0.0.1-SNAPSHOT.jar

spring-boot-app-push:
	docker-compose -f docker-compose.yml push spring-boot-app

spring-boot-app-stop:
	docker-compose -f docker-compose.yml stop spring-boot-app

stop-all:
	docker-compose -f docker-compose.yml stop
