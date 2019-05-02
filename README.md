# Catcourse_Qualtrics-Compare

Welcome to Catcourse-Qualtrics Compare!

## Setup:
In order to run the application, you need to have JDK installed in your system.

Tools needed for running the app:

Link to installing JDK: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Running the application:

Note: You should have two CSV files in the “Data” folder inside “List-Generator” before running the application. Refer to the sample format for catcourse roster and qualtrics roster in the files "testcat.csv" and "testqualtrics.csv". 

- Open the "Catcourse-Qualtrics.jar" file. Once you open, a dialog box will appear with a welcome message 

- Enter the Catcourse roster CSV file (Ex. testcat.csv)

- Enter the Qualtrics roster CSV file (Ex. testqualtrics.csv)

- You will recieve a "Success!" message indicating that the comparision is completed. The output will be stored in the “list.txt” folder

## Troubleshooting (Unix)
If you are having issues follow these steps.

### This program requires the latest version of Java. Follow these steps to reinstall

- Uninstall previous versions of Java 
   - `sudo rm -fr /Library/Internet\ Plug-Ins/JavaAppletPlugin.plugin `
   - `sudo rm -fr /Library/PreferencePanes/JavaControlPanel.prefPane `
   - `sudo rm -fr ~/Library/Application\ Support/Oracle/Java`

- To check if uninstallation happened successfully
  - `java -version`

- Download and install the JDK: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
   - Check if the JRE and JDK are the same versions using `java -version `
 
- If problems persist try to remove any bad class files (./Team_Agreement.class), we might have to delete. 
  - `rm -rf *.class`

