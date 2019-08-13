package la.sample

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText("Greetings, Earthlings!  Maven, Kotlin and Ktor salute you.", ContentType.Text.Html)
            }
        }
    }
    server.start(wait = true)
}