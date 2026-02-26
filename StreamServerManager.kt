// StreamServerManager.kt

package your.package.name

import android.util.Log
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class StreamServerManager {

    private val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/stream") {
                call.respondText("HTTP Streaming Server is running!", ContentType.Text.Plain)
            }
        }
    }

    fun startServer() {
        runBlocking {
            launch { server.start(wait = true) }
            Log.i("StreamServerManager", "HTTP Streaming Server started on port 8080")
        }
    }

    fun stopServer() {
        server.stop(0, 0)
        Log.i("StreamServerManager", "HTTP Streaming Server stopped")
    }
}