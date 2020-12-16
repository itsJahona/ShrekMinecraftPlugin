serve:
	mvn clean package
	cp target/duloc-magma-1.0-SNAPSHOT.jar server/plugins/duloc-magma-1.0-SNAPSHOT.jar
	cd server && java -Xmx1024M -Xms1024M -jar Magma-9e0b1b1-server.jar nogui

reload:
	mvn clean package
	cp target/duloc-magma-1.0-SNAPSHOT.jar server/plugins/duloc-magma-1.0-SNAPSHOT.jar