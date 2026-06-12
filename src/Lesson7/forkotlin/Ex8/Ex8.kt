package Lesson7.forkotlin.Ex8

enum class Month(val days: Int) {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31)
}
fun getDaysInMonth(month: Month): Int {
    return when (month) {
        Month.JANUARY -> month.days
        Month.FEBRUARY -> month.days
        Month.MARCH -> month.days
        Month.APRIL -> month.days
        Month.MAY -> month.days
        Month.JUNE -> month.days
        Month.JULY -> month.days
        Month.AUGUST -> month.days
        Month.SEPTEMBER -> month.days
        Month.OCTOBER -> month.days
        Month.NOVEMBER -> month.days
        Month.DECEMBER -> month.days

    }
}