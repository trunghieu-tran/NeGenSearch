# NeGenSearch
New Generation Search

Including modules:

## Crawler
### Purpose
To crawl data webpage from the Intenet. We chose Wikipedia website for this project.
### How to run?
1. Clone this project to your local
2. Edit configuration of crawler in BasicCrawlController.java file
3. Cd to directory: Crawler/
4. Run command to start crawling: "bash run.sh" 
5. If it occurs error in compiling, please ENABLE the first line of file run.sh, and re-run the command in line 4.
  

## Search 
### Purpose
To search a query
### How to run?
1. Clone this project to your local
2. Cd to directory: Crawler/
3. Edit query search at runSearch.sh. (For example: if you want to search "programming", edit -Dexec.args in the runSearch.sh as: -Dexec.args="programming")
4. Run command to start crawling: "bash runSearch.sh" 
5. Result would be returned on both screen and file : "./src/main/resources/ResultSearch.txt"

## FrontEnd to BackEnd
### How to transfer from Java Structure to Java Web Structure?
1. File -> Project Structure -> Facets -> + -> choose Web
2. File -> Project Structure -> Artifacts -> + -> Web Application-Exploded
3. Put "GetSearchServlet.java" to Indexing directory, and put "search.jsp" to web directory
4. You can see error in "GetSearchServelt.java", move cursor on error part, it would show add library, and then download library
5. You can ignore "Cannot find JSONOject error"
6. File -> Project Structure -> Libraries -> + from Maven -> find "edu.uci.ics:crawler4j:4.4.0"
7. Then you can see Top-Right, it shows add configuration, choose Tomcat local, choose the location where your tomcat locate
8. In Run/Debug Configuration window, choose "Deployment Tab", add your project artifact to it, and and green triangle should be activated
9. Finally, edit "web.xml" under WEB-INF, paste this one, this would let server know which web page to show  
<display-name>SearchEngineRef</display-name>  
<welcome-file-list>  
    <welcome-file>search.jsp</welcome-file>  
</welcome-file-list>
10. Press green triangle button, run server
11. When you type something, press search button, the console should show "Enter Servlet Controller Post Do" which is in "GetSearchServlet.java"
  
