
Git setup:
356560102448118 vin
357335099268517 man
357335099326703   CUL211894711761
357349095787925.
https://git-scm.com/download/mac
B008549
08/26/2020 to 09/22/2020
Install home-brew



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


Installation of node JS:





AIzaSyAb6H41USfHwYhKP3s1JdOYHA7olnKdOVE
sudo apt-get install git

To be cloned in Jupiter notebook

git clone https://github.com/GoogleCloudPlatform/training-data-analyst


cd training-data-analyst/courses/machine_learning/deepdive/01_googleml/earthquakes

less ingest.sh. ( Removed all existing earthquake CSV data)

bash ingest.sh. ( Download fresh file)


cat install_missing.sh
bash install_missing.sh

Eg: gsutil cp earthquakes.* gs://qwiklabs-gcp-01-4051af9ca6fc/earthquakes

gsutil cp {directory path} gs://{bucketname}

Making it public:
gsutil defacl set public-read gs://{bucketname}


Big query in Jupiter notebook
———————————————

from google.cloud import bigquery
bq = bigquery.Client(project=‘{ProjectName}’)

94b78.b3eb23
9911124
1.386.0


—————————————————
query="""
SELECT
  departure_delay,
  COUNT(1) As num_flights,
  APPROX_QUANTILES(arrival_delay, 10) AS arrival_delay_deciles

  From
   `bigquery-samples.airline_ontime_data.flights`

   group by
    departure_delay
    HAVING
    num_flights >100
    order by
    departure_delay ASC
    """
—————————————————————
df=bq.query(query).to_dataframe()
—————————————————————
df.head()
————————————————

import pandas as pd
percentiles=df['arrival_delay_deciles'].apply(pd.Series)
percentiles-percentiles.rename(columns=lambda x:str(x*10)+ "%")
df=pd.concat([df['departure_delay'], percentiles],axis=1)
df.head()

———————————————————

df.shape
————————
df.plot(x='departure_delay',xlim=(-30,50), ylim=(-50,50))





Jenkins:
VInodkpk
test
http://127.0.0.1:8080
saucelabURL: https://saucelabs.com/
Credentials:
Username: discovery-manual
Password: discovery-manual

[Yesterday 6:10 PM] Rama Krishna Madamanchi
https://app.testobject.com/#/macys-parent

[Yesterday 6:10 PM] Rama Krishna Madamanchi
1. Username: macys-parent
2. Password: macysparent123

Mysql
sudo mysql -u root -p
root
root1234, 739

mvn clean install -DskipTests
Cd discovery-xapi-service
mvn spring-boot:run -P dev
mvnDebug spring-boot:run -P dev


Django setup to initiate server
Then run python manage.py run server
http://127.0.0.1:8000/

Automation Framework
Resource allocation
Browser Testing
Any additional scope in site?
Scrum Masters( Magesh as SM)
Release management


"test:chrome": "testcafe chrome",
    "test:chrome:5": "testcafe -c 5 chrome ./tests/Browse -s takeOnFails=true",
    "test:chrome:headless": "testcafe chrome:headless ./tests/Browse",
    "test:chrome:headless:5": "testcafe -c 5 chrome:headless ./tests/Browse -s takeOnFails=true",
    "test:chrome:mobile": "testcafe chrome:emulation:device=iphone X ./tests/Browse",
    "test:safari": "testcafe safari ./tests/Browse",
    "test:multiple": "testcafe safari,chrome ./tests/Browse -s takeOnFails=true"


/Users/b008549/IdeaProjects/mtp-testcafe-impl-master_2/data/MacysTestData.json

Jenkins command within the Root folder

java -jar jenkins.war --httpPort=8080 --enable-future-java

npm run test:chrome ./tests/Browse

52334373

Python
Linspace
Numpy
Range
Arange



