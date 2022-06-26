# Apache-Spark-with-Delta-Lake

## Requirement To Integrate Apache Spark with Delta Lake:
1. Java jdk(latest version)
2. Apache Spark(3.1.2)
3.  IntelliJ IDE
## Installation :
1)JAVA jdk

Step(i): Download java jdk(11) from Oracle

step(ii): Setup Environmental variable:  
In windows 

Click on Start->(search)Edit system Environmental variables->new->Enter JAVA_HOME as variable name->In variable value(PASTE YOUR JDK PATH)->Click OK
 
 To verify your java installation, 
  in cmd type

   java --version 
  
   this command will display you the java version you installed

Step 2:  Installing Apache Spark:

1. Open a browser and navigate to https://spark.apache.org/downloads.html.

2. Under the Download Apache Spark heading, there are two drop-down menus. Use the current non-preview version.

In our case, in Choose a Spark release drop-down menu select 3.1.2(Jan 26 2022).
In the second drop-down Choose a package type, leave the selection Pre-built for Apache Hadoop 2.7.

3. Click the spark-3.2.1-bin-hadoop2.7.tgz link.

 
4. Installing Apache Spark involves extracting the downloaded file to the desired location.

1. Create a new folder named Spark in the root of your C: drive. From a command line, enter the following:

cd \

mkdir Spark

2. In Explorer, locate the Spark file you downloaded.

3. Right-click the file and extract it to C:\Spark using the tool you have on your system (e.g., 7-Zip).

4. Now, your C:\Spark folder has a new folder spark-3.2.1-bin-hadoop2.7 with the necessary files inside.

Step 6: Add winutils.exe File
Download the winutils.exe file for the underlying Hadoop version for the Spark installation you downloaded.

1. Navigate to this URL

 https://github.com/cdarlint/winutils 
 
 and inside the bin folder, locate winutils.exe, and click it.

Winutils download page
2. Find the Download button on the right side to download the file.

3. Now, create new folders Hadoop and bin on C: using Windows Explorer or the Command Prompt.

4. Copy the winutils.exe file from the Downloads folder to C:\hadoop\bin.

Step 7: Configure Environment Variables
Configuring environment variables in Windows adds the Spark and Hadoop locations to your system PATH. It allows you to run the Spark shell directly from a command prompt window.

1. Click Start and type environment.

2. Select the result labeled Edit the system environment variables.

3. A System Properties dialog box appears. In the lower-right corner, click Environment Variables and then click New in the next window.

Add new environment variable in Windows.
4. For Variable Name type SPARK_HOME.

5. For Variable Value type C:\Spark\spark-3.2.1-bin-hadoop2.7 and click OK. If you changed the folder path, use that one instead.

Adding Spark home variable path in Windows.
6. In the top box, click the Path entry, then click Edit. Be careful with editing the system path. Avoid deleting any entries already on the list.

Edit the path variable to add Spark home.
7. You should see a box with entries on the left. On the right, click New.

8. The system highlights a new line. Enter the path to the Spark folder C:\Spark\spark-3.2.1-bin-hadoop2.7\bin. We recommend using %SPARK_HOME%\bin to avoid possible issues with the path.

Adding the Spark home to the path Windows variable.
9. Repeat this process for Hadoop and Java.

For Hadoop, the variable name is HADOOP_HOME and for the value use the path of the folder you created earlier: C:\hadoop. Add C:\hadoop\bin to the Path variable field, but we recommend using %HADOOP_HOME%\bin.Step 5: Install Apache Spark
Installing Apache Spark involves extracting the downloaded file to the desired location.

1. Create a new folder named Spark in the root of your C: drive. From a command line, enter the following:

cd \

mkdir Spark

2. In Explorer, locate the Spark file you downloaded.

3. Right-click the file and extract it to C:\Spark using the tool you have on your system (e.g., 7-Zip).

4. Now, your C:\Spark folder has a new folder spark-3.2.1-bin-hadoop2.7 with the necessary files inside.

Step 3: Add winutils.exe File
Download the winutils.exe file for the underlying Hadoop version for the Spark installation you downloaded.

1. Navigate to this URL https://github.com/cdarlint/winutils and inside the bin folder, locate winutils.exe, and click it.

Winutils download page
2. Find the Download button on the right side to download the file.

3. Now, create new folders Hadoop and bin on C: using Windows Explorer or the Command Prompt.

4. Copy the winutils.exe file from the Downloads folder to C:\hadoop\bin.

Step 7: Configure Environment Variables
Configuring environment variables in Windows adds the Spark and Hadoop locations to your system PATH. It allows you to run the Spark shell directly from a command prompt window.

1. Click Start and type environment.

2. Select the result labeled Edit the system environment variables.

3. A System Properties dialog box appears. In the lower-right corner, click Environment Variables and then click New in the next window.

Add new environment variable in Windows.
4. For Variable Name type SPARK_HOME.

5. For Variable Value type C:\Spark\spark-3.2.1-bin-hadoop2.7 and click OK. If you changed the folder path, use that one instead.

Adding Spark home variable path in Windows.
6. In the top box, click the Path entry, then click Edit. Be careful with editing the system path. Avoid deleting any entries already on the list.

Edit the path variable to add Spark home.
7. You should see a box with entries on the left. On the right, click New.

8. The system highlights a new line. Enter the path to the Spark folder C:\Spark\spark-3.2.1-bin-hadoop2.7\bin. We recommend using %SPARK_HOME%\bin to avoid possible issues with the path.

Adding the Spark home to the path Windows variable.
9. Repeat this process for Hadoop and Java.

For Hadoop, the variable name is HADOOP_HOME and for the value use the path of the folder you created earlier: C:\hadoop. Add C:\hadoop\bin to the Path variable field, but we recommend using %HADOOP_HOME%\bin.

Step 3: Install Intellij IDE

1. download the Intellij Community version

https://www.jetbrains.com/idea/download/#section=windows

2. Install and download Scala Plugin

3. To create a new scala project

click File->new->Project->Scala->sbt->(give_your_Project_name)->OK
after creating your project

To connect spark 3.2.1 to delta add the following depencies to your build.sbt 

libraryDependencies += "io.delta" %% "delta-core" % "1.0.1"


click file->Project Structure->Dependencies->click + ->jars-libraries->browse to C:/spark-3.1.2-bin-hadoop3.2/jars

click on main->src->Scala object->Give a scala object name

Now you can add a main class i.e.
def main(args: Array[String])
and start writing your spark code
