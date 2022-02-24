class ListArray<T>(
    var content: Array<T>
) {
    fun size(): Int {
        return content.size
    }

    fun isEmpty(): Boolean {
        return content.isEmpty()
    }

    fun indexOf(item: T): Int {
        return if (!content.contains(item)) -1
        else content.indexOf(item)
    }

    fun toArray(): Array<T> {
        return content
    }

    fun get(index: Int): T {
        return content[index]
    }


    fun add(item: T) {
        val list = content.toMutableList()
        list.add(item)

        content = list.toTypedArray()
    }

    fun set(index: Int, item: T) {
        content[index] = item
    }

    fun contains(item: T): Boolean {
        return content.contains(item)
    }

    fun lastIndexOf(item: T): Int {
        return if (!content.contains(item)) -1
        else content.lastIndexOf(item)
    }
}