name := "gddp"

libraryDependencies ++= Seq(
  "geopyspark.geotrellis"        % "geotrellis-backend"   % "0.1.0" % "provided" from "file:///tmp/geotrellis-backend-assembly-0.2.2.jar",
  "org.apache.hadoop"            % "hadoop-client"        % "2.7.3" % "provided",
  "org.apache.spark"            %% "spark-core"           % "2.1.0" % "provided",
  "edu.ucar"                     % "cdm"                  % "5.0.0-SNAPSHOT" from "file:///tmp/netcdfAll-5.0.0-SNAPSHOT.jar",
  "com.amazonaws"                % "aws-java-sdk-s3"      % "1.11.92" % "provided",
  "org.apache.hadoop"            % "hadoop-client"        % "2.7.3"   % "provided"
)

fork in Test := false
parallelExecution in Test := false
