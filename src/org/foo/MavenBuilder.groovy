pacakge org.foo
class MavenBuilder1 {
Map map_var
  def mavenBuild(){
    "mvn " + map_var.builder.maven.goal
  }

}