pacakge org.foo
class MavenBuilder {
  Map map_var
  def mymavenBuild(){
    "mvn " + map_var.builder.maven.goal
  }

}