package oop.sealedclass

fun main(args: Array<String>) {
    var success = Result.Success("SUCCESS")
    getData(success)

    var error = Result.Error("ERROR")
    getData(error)

    var progress = Result.Progress("PROGRESS")
    getData(progress)

}

fun getData(result: Result) {
    when(result) {
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
    }
}
