package eu.artist.moola.exec

class ExecutionContext {

	private Closure work;
	
	void run() {
		work.delegate = this
		work.resolveStrategy = Closure.DELEGATE_FIRST
		work.run()
	}
	
	
	def dispatch(args){
		return args
	}
	
	
	
	def runtimeProperties = [:]
	
	def propertyMissing(String name) {
		// println "missing call for $name"
		if( runtimeProperties[ name ] != null ) {
			runtimeProperties[ name ]
		}
	}

	def propertyMissing(String name, def value) {
		runtimeProperties[ name ] = value
	}
	
}
