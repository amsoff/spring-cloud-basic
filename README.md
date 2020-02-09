# Sumarry:
1. Local configuration fall out of sync, No history, sometimes require restart.
2. Spring cloud config- http file access cong to git or any file based confg. Any file we can consume over http
    We add the conf files to the project. 
    Local files:
   a. We need to choose config server
   b.  In our local files we writes points to classpath, support for placeholder in URI
   
   Git based:
   points to git repo, full history multiple profiles
   
   Setting the files: yml, properties, but any text that can be consume over http
   {appname}-{profile}.yml
   
   For remote connection, we will point the, for example, git location:
   spring.cloud.config.server.git.uri -- point to git
   spring.cloud.config.server.git.searchPaths -- subdirs
   spring.cloud.config.server.git.repos -- alternate repos
   spring.cloud.config.server.git.repos.prod.pattern -- pattern to go to alternate repos
   
   ## Consuming Configuration:
   1. Spring apps use Config Servers as a property source
   2. Loads values based in app name, profile and labels
   3. Annota code with @value
   4. Can consume from non Spring apps 
   
   Question: Why ro add few properties file (besides the app and profiles), aka bootstrap and application?
   bootstrap.yml is loaded before application.yml.
   It is typically used for the following:
   when using Spring Cloud Config Server, you should specify spring.application.name and spring.cloud.config.server.git.uri inside bootstrap.yml
   some encryption/decryption information
   Technically, bootstrap.yml is loaded by a parent Spring ApplicationContext. That parent ApplicationContext is loaded before the one that uses application.yml.