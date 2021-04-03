package sk.kubo.army.soldier

import sk.kubo.army.skill.Attack
import sk.kubo.army.skill.Offensive

class Archer(name: String) : Soldier(name), Offensive {
    override fun attack(attackCommand: Attack) {
        when (attackCommand) {
            is Attack.Normal, is Attack.Aggressive -> println("${reportName()} - dealing 3 dmg to ${attackCommand.target}")
            is Attack.Sneaky -> println("${reportName()} - dealing 5 dmg to ${attackCommand.target}")
        }
    }

    override fun reportName(): String = "Archer $name"
}