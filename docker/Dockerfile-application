FROM maven:3.9.9 AS build

COPY ../src /app/src
COPY ../pom.xml /app/pom.xml

WORKDIR /app

RUN mvn clean package


FROM tomcat:11 AS deploy

# Documentação sobre anotações de metadados presente em:
# https://github.com/opencontainers/image-spec/blob/main/annotations.md
LABEL org.opencontainers.image.authors="luanvilaca1@gmail.com" \
      org.opencontainers.image.description="Imagem contendo uma aplicação web de uma pokedex utilizando servlets"

ENV CATALINA_HOME=/usr/local/tomcat

COPY --from=build /app/target/pokedex.war $CATALINA_HOME/webapps/pokedex.war

RUN mv webapps.dist/* webapps/ && \
    rmdir webapps.dist

EXPOSE 8080

CMD ["catalina.sh", "run"]
