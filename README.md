# GradleSpring
 ./gradlew clean build
 ./gradlew bootRun




#Docker Commands
docker build -f Dockerfile -t my-sprint-boot .
docker images
docker run -p 9003:9000 my-spring-boot

#Git Command
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"

brew install git
git --version
git config --global user.name "Vinod Kumar"
git config --global user.name vinodkpk@gmail.com
Git  config
git config --list

Create a local folder in computer :Git-test
Create a file : index.html

Got to terminal to the git folder created
Run command :git init
Run command : git status
Run command : git add .
Run command : git status
Run command : git commit
Run Command: git commit -m "first commit"
Run Command : Git status
Run Command: git log --oneline
Git mv b.txt bb.txt ( to rename a file)

45dcbbb (HEAD -> master) Third Commit
e60ec06 Second Commit
b8d8052 first commit

In case of rollback ( checkout)

git checkout 45dcbbb index.html
Then do
Git commit

Mirroring local git repository with only bitbucket

Go to local created folder through terminal
git remote add origin https://vinodkpk@bitbucket.org/vinodkpk/git-test.git
git push -u origin master

#Jenkins
Jenkins:
VInodkpk
test
http://127.0.0.1:8080

#GCP
gcloud config list account
gcloud config list project

#In the Cloud Shell command line, enter the following command to create an environment variable that contains the project ID for this lab:
export PROJECT_ID=$(gcloud config list --format 'value(core.project)')
gcloud config set compute/zone us-east1-b
gcloud config list
cd ~/
#Git CLone
cd ~/
git clone https://github.com/saturnism/spring-cloud-gcp-guestbook.git
#Make a copy of the initial version of the backend application (guestbook-service).
cp -a ~/spring-cloud-gcp-guestbook/1-bootstrap/guestbook-service \
  ~/guestbook-service
#Run the backend application. 
  cd ~/guestbook-service
  ./mvnw -q spring-boot:run -Dserver.port=8081
  
#Test the service
curl http://localhost:8081/guestbookMessages

#Make a copy of front end
cp -a ~/spring-cloud-gcp-guestbook/1-bootstrap/guestbook-frontend \
  ~/guestbook-frontend
  
# Run the front end application
cd ~/guestbook-frontend
./mvnw -q spring-boot:run
  
# Do a web preview at designated port 8080

  
  
#Copy the application forlders to cloud shell
gsutil -m cp -r gs://$PROJECT_ID/* ~/
#make project scripts executable:
chmod +x ~/guestbook-frontend/mvnw
chmod +x ~/guestbook-service/mvnw
#enable cloud trace
gcloud services enable cloudtrace.googleapis.com
#Pom Dependency for trace
<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-gcp-starter-pubsub</artifactId>
        </dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-hateoas</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
        <dependency>
			<groupId>org.hsqldb</groupId>
			<artifactId>hsqldb</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-gcp-starter-pubsub</artifactId>
        </dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-hateoas</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
		 <dependency>
                    <groupId>org.springframework.integration</groupId>
                    <artifactId>spring-integration-core</artifactId>
               </dependency>
         <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-gcp-starter-trace</artifactId>
		</dependency>
		        <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-gcp-starter-storage</artifactId>
                </dependency>
                <dependency>
                  <groupId>org.springframework.cloud</groupId>
                  <artifactId>spring-cloud-gcp-starter-vision</artifactId>
                </dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
                    <groupId>org.springframework.integration</groupId>
                    <artifactId>spring-integration-core</artifactId>
               </dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	</dependencies>

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
  
        
#Pub SUb Message enabling
gcloud services enable pubsub.googleapis.com    
#Create Pubsub Topic with name messages
gcloud pubsub topics create messages 
#Create subscription
gcloud pubsub subscriptions create messages-subscription-1 \
  --topic=messages
#Pull message from subscription
gcloud pubsub subscriptions pull messages-subscription-1
#Acknowledge message
gcloud pubsub subscriptions pull messages-subscription-1 --auto-ack   
#Pubsub dependency
<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-gcp-starter-pubsub</artifactId>
        </dependency>
        
#Gradle expecution
./gradlew bootRun




