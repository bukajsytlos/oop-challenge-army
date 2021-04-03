package sk.kubo.army.soldier

import sk.kubo.army.Command
import sk.kubo.army.CommandExecutor
import sk.kubo.army.skill.Attack
import sk.kubo.army.skill.Defence
import sk.kubo.army.skill.Defensive
import sk.kubo.army.skill.Flank
import sk.kubo.army.skill.Flanking
import sk.kubo.army.skill.Offensive
import sk.kubo.army.skill.Report
import sk.kubo.army.skill.Reportable
import sk.kubo.army.skill.Skill

abstract class Soldier(val name: String): CommandExecutor, Reportable {

    override fun execute(command: Command) {
        when {
            command is Attack && this is Offensive -> attack(command)
            command is Defence && this is Defensive -> defend(command)
            command is Flank && this is Flanking -> flank(command)
            command is Report -> report(command)
        }
    }

    override fun report(reportCommand: Report) {
        println("Soldier ${reportName()} here. Skills [${skills().joinToString()}]" )
    }

    private fun skills(): Set<String> = getClassSkills(javaClass).map { it.simpleName }.toSortedSet()

    private fun getClassSkills(clazz: Class<*>?): Set<Class<Skill>> {
        //todo cache/static initialization
        if (clazz == null) {
            return emptySet()
        }
        val skills: MutableSet<Class<Skill>> = HashSet()
        skills.addAll(clazz.interfaces.filter { Skill::class.java.isAssignableFrom(it) }.map { it as Class<Skill> })
        skills.addAll(getClassSkills(clazz.superclass))

        return skills
    }

    abstract fun reportName(): String
}