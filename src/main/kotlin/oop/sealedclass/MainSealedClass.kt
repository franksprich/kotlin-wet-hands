package oop.sealedclass

fun main(args: Array<String>) {
    var success = Result.Success("SUCCESS")
    getData(success)

    var progress = Result.Progress("PROGRESS")
    getData(progress)

//    var error = Result.Error("ERROR")
//    getData(error)

    var recoverableError = Result.Error.RecoverableError(Exception("exception"), "RecoverableError")
    getData(recoverableError)
}

fun getData(result: Result) {
    when(result) {
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}
