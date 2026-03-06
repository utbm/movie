# Utilisation de l'image officielle Temurin basée sur Debian Bookworm
FROM eclipse-temurin:21-jdk-bookworm

# Éviter les questions interactives lors de l'installation
ENV DEBIAN_FRONTEND=noninteractive

# Installation des outils (Debian utilise apt-get)
RUN apt-get update && apt-get install -y \
    maven \
    git \
    curl \
    mc \
    iftop \
    sudo \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

# Configuration de l'utilisateur 'vscode' pour Codespaces
# On lui donne les droits sudo et on l'ajoute au groupe docker
RUN groupadd vscode \
    && useradd -m -g vscode -s /bin/bash vscode \
    && echo "vscode ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers \
    && groupadd docker || true \
    && usermod -aG docker vscode

# On définit l'utilisateur par défaut pour le conteneur
USER vscode
