build:
	./mvnw clean package

run:
	java -jar target/app-1.0-SNAPSHOT-jar-with-dependencies.jar

update:
	./mvnw versions:display-dependency-updates
	./mvnw versions:display-plugin-updates
	./mvnw versions:display-property-updates
	./mvnw versions:update-properties

make lint:
	./mvnw checkstyle:check