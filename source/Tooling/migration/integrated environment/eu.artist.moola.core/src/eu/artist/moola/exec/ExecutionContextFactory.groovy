package eu.artist.moola.exec

import eu.artist.moola.dsl.core.Project

class ExecutionContextFactory {

	static ExecutionContext create(Project project){
		def context = new ExecutionContext ();
		context.work = project.runClosure;
		
		project.trafos.each { name, trafo ->  
			println "adding $name"
			

			
			context.metaClass."$name" = { ...args ->
				println args
				println args.size()
				trafo.setInput(args)
				return trafo.run()
			}
			
		}
		
		
		return context;
	}
	
}
