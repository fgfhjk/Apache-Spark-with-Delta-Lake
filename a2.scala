Demo
To integrate spark with Delta Lake add a library dependency to build.sb

libraryDependencies += "io.delta" %% "delta-core" % "1.0.1"

(for Spark 3.2.1)

to know your version compatiblity click on this URL

https://docs.delta.io/latest/releases.html

Example:

▪ Read CSV file (people.csv) into dataframe

▪ Write the data in the above dataframe to local filesystem in delta format

▪ Read the above data written in the delta format into dataframe

▪ Show record count for above dataframe

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
object a2 {

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder()
      .master("local[2]")
      .appName("a1")
      .getOrCreate()
    val df = spark.read.format("csv")
      .option("header", "True")
      .option("inferschema", "True")
      .load("C:/Users/user/Desktop/Assessment/people.csv")
// writing dataframe to Delta
    df.write.format("delta").mode("overwrite").save("C:/Users/user/Desktop/A")
 // reading Delta from Local to Dataframe   
val df2=spark.read.format("delta").load("C:/Users/user/Desktop/A")
  df2.show()
  //total count of records  
    println("total count of records"+ df2.count())


  }
}
