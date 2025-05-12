# Step 1: Use a lightweight Java image
FROM openjdk:17-alpine

# Step 2: Set the working directory inside the image
WORKDIR /app

# Step 3: Copy all project files into the container (including All_OOPS folder)
COPY . /app

# Step 4: Compile the Java program
RUN javac All_OOPS/PaymentController.java

# Step 5: Set the default command to run the program
CMD ["java", "-cp", "All_OOPS", "PaymentController"]
