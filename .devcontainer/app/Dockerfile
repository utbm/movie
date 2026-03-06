FROM eclipse-temurin:21

# Installation des outils
RUN apt-get update && apt-get install -y \
    maven \
    git \
    curl \
    mc \
    iftop \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*
