package sk.kubo.army

import sk.kubo.army.soldier.Soldier

class Army : CommandExecutor {
    private val soldiers: MutableList<Soldier> = ArrayList()

    fun addSoldier(soldier: Soldier) = soldiers.add(soldier)

    override fun execute(command: Command) {
        println("============ ${command.name} ============")
        soldiers.forEach { it.execute(command) }
    }
}