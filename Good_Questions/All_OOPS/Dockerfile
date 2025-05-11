# Use the official OpenJDK base image with a specific version
FROM openjdk:17-alpine

# Set a working directory inside the container
WORKDIR /app

# Copy the necessary files from your local project directory to the container
# COPY ./All_OOPS /app/All_OOPS
# COPY ./All_OOPS/PaymentController.java /app/All_OOPS/
COPY PaymentController.java /app/All_OOPS/


# Compile the Java program
# RUN javac All_OOPS/PaymentController.java
RUN javac /app/All_OOPS/PaymentController.java


# Set the default command to run your application
# CMD ["java", "All_OOPS.PaymentController"]
CMD ["java", "-cp", "/app/All_OOPS", "PaymentController"]


# Optionally expose a port if your application is a web app or listens on a port
# EXPOSE 8080

# Optional: Add a health check if needed
# HEALTHCHECK --interval=30s --timeout=10s --retries=3 CMD curl --fail http://localhost:8080/health || exit 1
