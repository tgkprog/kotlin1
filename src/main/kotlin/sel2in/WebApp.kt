package sel2in

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    var s = K1()
        s.main()

    s.main()
     var r =  Thread(){
         embeddedServer(Netty, port = 9703) {
             routing {
                 get("/") {
                     var  d = call.request.queryParameters.get("k")
                     call.respondText("aa ha " + d + java.util.Date())
                 }
             }
         }.start(wait = false)
        while (true){
            try {
                Thread.sleep(100)
            }catch (e : Throwable){
                println(e)
            }
        }
    }
    r.start()
    r.join()
    s.main()
}