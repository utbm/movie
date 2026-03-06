FROM eclipse-temurin:21

# Éviter les questions interactives
ENV DEBIAN_FRONTEND=noninteractive

# 1. Installation des outils en tant que ROOT
RUN apt-get update && apt-get install -y \
    maven \
    git \
    curl \
    mc \
    iftop \
    sudo \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

# 2. Création de l'utilisateur vscode (UID 1000 est le standard Codespaces)
RUN groupadd --gid 1000 vscode \
    && useradd --uid 1000 --gid 1000 -m vscode \
    && echo "vscode ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers

# 3. Ajout au groupe docker (pour le socket)
# On crée le groupe s'il n'existe pas, puis on y ajoute vscode
RUN groupadd -g 999 docker_host || groupadd docker || true \
    && usermod -aG sudo vscode

# On définit l'utilisateur par défaut
USER vscode
