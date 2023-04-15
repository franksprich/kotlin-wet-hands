package oop.innerclasses

class ListView(var items: Array<String>) {

    inner class ListViewItem() {

        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}
