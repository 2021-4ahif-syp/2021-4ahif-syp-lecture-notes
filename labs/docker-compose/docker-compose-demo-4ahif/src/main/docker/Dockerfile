FROM openjdk:14

WORKDIR /deployments
#RUN mkdir /deployments
COPY demo.jar .

COPY scripts/* /deployments/
RUN sed -e 's/\r$//' -i /deployments/*.sh && chmod +x /deployments/*.sh

EXPOSE 8080
ENTRYPOINT ["./run.sh"]