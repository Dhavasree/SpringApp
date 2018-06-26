Project Setup Details-
********************************************************************************************************

------------------
A-Database setup -
------------------

1-Download H2 Platform Independent file from "http://www.h2database.com/html/download.html" 
Download this file - "Platform-Independent Zip".

2-Run h2-1.4.197.jar file in bin folder of file extract. It would open in browser.

3-Run below sql command to create table.  

CREATE TABLE Product(ID INT NOT NULL AUTO_INCREMENT, Model_Name VARCHAR(20),
BRAND_NAME VARCHAR(20),COUNTRY VARCHAR(20),PRICE REAL, PRIMARY KEY (ID))

4-Once table is created open task manager and close javaw.exe process.
**********************************************************************************************************
----------------------------------------
B-Import Project from git into Eclipse-
----------------------------------------

1-Create a git repository in eclipse using uri as- "https://github.com/rohitkasture/SpringApps.git"

2-Import a project from git - right click on project explorer area->import->
search for git->project from git->select existing local repository->
projects-"Git path"->select ProductCart (import as general project)->
finish.

3-Convert project into maven project. (right click on project explorer area configure->convert into maven project)

4-Goto Buildpath ->configure buildpath ->Add java 8,maven, and Apache tomcat in the library.->goto order and export select all.->finish.

5-Goto Properties -> project facet ->check java version as java8 and tomcat as runtime.
 
6-Add apache tomcat server and run project on server.

