FROM eclipse-temurin:21-jdk-bookworm

# Éviter les alertes interactives
ENV DEBIAN_FRONTEND=noninteractive

# Installation des outils Debian (apt-get)
RUN apt-get update && apt-get install -y \
    maven \
    git \
    curl \
    mc \
    iftop \
    sudo \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

# Création de l'utilisateur vscode (indispensable pour Codespaces)
# On lui donne l'ID 1000 pour correspondre à l'hôte
RUN groupadd vscode \
    && useradd -m -g vscode -s /bin/bash vscode \
    && echo "vscode ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers \
    && groupadd docker || true \
    && usermod -aG docker vscode

USER vscode