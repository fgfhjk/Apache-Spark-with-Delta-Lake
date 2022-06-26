import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.execution.command.RunnableCommand
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

    df.write.format("delta").mode("overwrite").save("C:/Users/user/Desktop/A")
val df2=spark.read.format("delta").load("C:/Users/user/Desktop/A")
  df2.show(100)
    println("total count of reows are"+ df2.count())


  }
}
