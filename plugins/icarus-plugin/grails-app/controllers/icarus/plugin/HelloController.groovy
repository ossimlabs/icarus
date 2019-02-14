package icarus.plugin

class HelloController {

    def index() { render "Hello World!! ${new Date()}" }
}
