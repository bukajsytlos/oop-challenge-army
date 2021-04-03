package sk.kubo.army.soldier

import sk.kubo.army.skill.Attack
import sk.kubo.army.skill.Offensive

class Berserk(name: String) : Soldier(name), Offensive {

    override fun attack(attackCommand: Attack) {
        when (attackCommand) {
            is Attack.Normal, is Attack.Sneaky -> println("${reportName()} - dealing 2 dmg to ${attackCommand.target}")
            is Attack.Aggressive -> println("${reportName()} - dealing 5 dmg everyone around")
        }

    }

    override fun reportName(): String = "Berserk $name"

}