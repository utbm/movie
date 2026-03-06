# On utilise l'image officielle (Debian par défaut)
FROM eclipse-temurin:21

# Installation de Maven et des outils système
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y \
    maven \
    git \
    curl \
    sudo \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

# Création de l'utilisateur vscode pour la compatibilité Codespaces
RUN groupadd vscode \
    && useradd -m -g vscode -s /bin/bash vscode \
    && echo "vscode ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers

USER vscode
