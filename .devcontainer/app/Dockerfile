FROM eclipse-temurin:21-jdk-jammy

# Installation des outils
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y mc iftop maven curl git sudo \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

# Créer l'utilisateur vscode et lui donner les droits sudo + docker
RUN groupadd vscode \
    && useradd -m -g vscode -s /bin/bash vscode \
    && echo "vscode ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers \
    && groupadd docker || true \
    && usermod -aG docker vscode

USER vscode
