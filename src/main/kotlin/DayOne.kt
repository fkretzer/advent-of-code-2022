class DayOne {
    val inputDayOne = this::class.java.getResource("1.input.txt").readText()

    fun dayOne() {
        val sumPerElf = inputDayOne
            .split(System.lineSeparator())
            .fold(mutableListOf(mutableListOf<String>())) { current, calories ->
                when (calories) {
                    "" -> {
                        current.add(mutableListOf())
                    }

                    else -> {
                        current.last().add(calories)
                    }
                }
                return@fold current
            }
            .map { it -> it.map { it.toInt() } }
            .map { it.sum() }

        println("Day 1 / 1: ${sumPerElf.max()}")
        println("Day 1 / 2: ${sumPerElf.sorted().takeLast(3).sum()}")

}}