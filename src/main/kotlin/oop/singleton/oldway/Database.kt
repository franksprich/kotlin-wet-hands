package oop.singleton.oldway

class Database private constructor() {

    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (null == instance) {
                instance = Database()
                println("Instance created (old way)")
            }
            return instance
        }
    }
}
