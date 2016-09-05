A general java service template with ORM, REST handlers, timed tasks and other things you might need in an enterprisy java service. Made this before I knew that spring boot was a thing. Keeping it for old time's sake.

Steps:

Build war: mvn clean compile package test -P ${env} (dev/uat/staging/prod)

Run locally: mvn tomcat7:run
