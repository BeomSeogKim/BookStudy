package chapter02.exceptions

import atomictest.eq

fun averageIncomeWithNull(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main() {
    averageIncomeWithNull(3300, 3) eq 1100
    averageIncomeWithNull(5000, 0) eq null
}