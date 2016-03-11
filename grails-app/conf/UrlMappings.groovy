class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index",controller: "cliente")
        "500"(view:'/error')
        "/" {
            controller = "cliente"
            action = "index"
        }
	}
}
