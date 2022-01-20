class ListArray(
    var content: Array<Int>
) {
    fun size(): Int {
        return content.size
    }

    fun isEmpty(): Boolean {
        return content.isEmpty()
    }

    fun indexOf(int: Int): Int {
        return if (!content.contains(int)) -1
        else content.indexOf(int)
    }

    fun toArray(): Array<Int> {
        return content
    }

    fun get(index: Int): Int {
        return content[index]
    }


    fun add(int: Int) {
        val list = content.toMutableList()
        list.add(int)
        content = list.toTypedArray()
    }

    fun set(index:Int, int: Int) {
        content[index] = int
    }

    fun contains(int: Int): Boolean {
        return content.contains(int)
    }
    fun lastIndexOf(int: Int): Int {
        return if (!content.contains(int)) -1
        else content.lastIndexOf(int)
    }
}