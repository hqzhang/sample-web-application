pacakge org.foo
class MyMavenBuilder {
Map map_var
  def mymavenBuild(){
    "mvn " + map_var.builder.maven.goal
  }

}