ARG BASE_IMAGE
FROM ${BASE_IMAGE}
ENV SPRING_CLOUD_CONFIG_ENABLED=true \
    SPRING_CLOUD_DISCOVERY_ENABLED=true
WORKDIR $HOME
EXPOSE 8080
COPY *.jar $HOME
CMD $HOME/run.sh
USER root
RUN yum install -y bind-utils iputils nc nmap net-tools iproute tcpdump postgresql
USER omar
