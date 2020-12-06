fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.right)+ eval(expr.left)
        }

sealed class Expr()
data class Num(val value: Int) : Expr()
data class Sum(val left: Expr, val right: Expr) : Expr()