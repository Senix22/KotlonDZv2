class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(count){
            field = count
            counter++
        }
}