def call(String filePath, Closure closure){
    def request = libaryResource 'globalconfig.yml'
    println "request: $request"
    def map = readYaml text: request
     println "map: $map"
     if(!filePath.isEmpty()){
         def file_exist = findFiles (flob: filePath)
         if (file_exist.length == 1){
            def map1 = readYaml file: filePath
            println "map1: $map1"
            map.putAll(map1)
         }

     }
     MavenBuild builder = new MavenBuilder(map_var: map)
     closure.delegate = builder
     closure.reslveStragegy = Closure.DELEGATE_FIRST
     closure()
}

def call(Closure closure){

    call('', closure)
}