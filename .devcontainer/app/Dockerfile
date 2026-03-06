FROM mcr.microsoft.com/devcontainers/java:21-bookworm

# Installation tools
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y mc iftop maven \ 
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

RUN groupadd docker || true && usermod -aG docker vscode