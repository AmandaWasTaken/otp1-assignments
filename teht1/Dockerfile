# Runtime stage
FROM eclipse-temurin:17-jre

# Install native libraries required by JavaFX and GTK
RUN apt-get update && apt-get install -y --no-install-recommends \
    libgtk-3-0 \
    libxtst6 \
    libxrender1 \
    libxi6 \
    libxext6 \
    libx11-6 \
    libgl1 \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copy application
COPY target/temperature-converter-1.0-SNAPSHOT.jar app.jar

# Copy JavaFX runtime dependencies
COPY target/dependency/ ./lib/

# Launch JavaFX application
ENTRYPOINT ["java", \
    "--module-path", "/app/lib", \
    "--add-modules", "javafx.controls,javafx.fxml", \
    "-cp", "/app/app.jar", \
    "app.Main"]
