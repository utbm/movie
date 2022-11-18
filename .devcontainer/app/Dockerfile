FROM mcr.microsoft.com/devcontainers/java:21

# Install MariaDB client
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y mc iftop \ 
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*
