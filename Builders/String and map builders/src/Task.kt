import java.util.HashMap

fun <K, V> buildMap(build: HashMap<K, V>.() -> Unit):Map<K, V>{
    val hashmap = HashMap<K,V>()
    hashmap.build()
    return hashmap
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
