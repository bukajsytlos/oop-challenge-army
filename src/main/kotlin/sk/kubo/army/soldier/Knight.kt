package sk.kubo.army.soldier

import sk.kubo.army.skill.Defence
import sk.kubo.army.skill.Flank
import sk.kubo.army.skill.Flanking

class Knight(name: String) : Swordsman(name), Flanking {
    override fun flank(flankCommand: Flank) {
        println("${reportName()} - flanking")
    }

    override fun defend(defenceCommand: Defence) {
        when (defenceCommand) {
            is Defence.Normal -> println("${reportName()} - defending 4 dmg")
            is Defence.Static -> println("${reportName()} - defending 7 dmg")
        }
    }

    override fun reportName(): String = "Knight $name"
}