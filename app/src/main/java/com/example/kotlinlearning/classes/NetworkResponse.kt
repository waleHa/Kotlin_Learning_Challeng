package com.example.kotlinlearning.classes

sealed class NetworkResponse<out T> {
    data class Success<T>(val data: T): NetworkResponse<T>()
    data class Error(val exception: Exception): NetworkResponse<Nothing>()
    object Loading: NetworkResponse<Nothing>()
}

fun fetchData(): NetworkResponse<List<String>> {
    return when (val randomCondition = true) {  // Assuming this is for demonstration
        true -> {
            val dataFromServer = listOf("KFC", "McD", "Burger King")
            NetworkResponse.Success(dataFromServer)
        }
        else -> {
            val exception = Exception("Network error")
            NetworkResponse.Error(exception)
        }
    }
}

sealed class Expr {
    class Const(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
    object NotANumber: Expr()
}

fun eval(e: Expr): Int = when (e) {
    is Expr.Const -> e.value
    is Expr.Sum -> eval(e.left) + eval(e.right)
    Expr.NotANumber -> Double.NaN.toInt()
}


