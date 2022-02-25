class ListArray<T>(
    var content: Array<Any>
) {
    fun size(): Int {
        return content.size
    }

    fun isEmpty(): Boolean {
        return content.isEmpty()
    }

    fun indexOf(item: T): Int {
        return if (!content.contains(item as Any)) -1
        else content.indexOf(item as Any)
    }

    fun toArray(): Array<Any> {
        return content
    }

    fun get(index: Int): Any {
        return content[index]
    }

    fun add(item: T) {
        val list = content.toMutableList()
        list.add(item as Any)
        content = list.toTypedArray()
    }

    fun set(index: Int, item: T) {
        content[index] = item as Any
    }

    fun contains(item: T): Boolean {
        return content.contains(item as Any)
    }

    fun lastIndexOf(item: T): Int {
        return if (!content.contains(item as Any)) -1
        else content.lastIndexOf(item as Any)
    }
}