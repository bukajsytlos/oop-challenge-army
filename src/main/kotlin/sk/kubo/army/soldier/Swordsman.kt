package sk.kubo.army.soldier

import sk.kubo.army.skill.Attack
import sk.kubo.army.skill.Defence
import sk.kubo.army.skill.Defensive
import sk.kubo.army.skill.Offensive

open class Swordsman(name: String) : Soldier(name), Offensive, Defensive {
    override fun defend(defenceCommand: Defence) {
        println("${reportName()} - defending 3 dmg")
    }

    override fun attack(attackCommand: Attack) {
        when (attackCommand) {
            is Attack.Normal, is Attack.Sneaky, is Attack.Aggressive -> println("${reportName()} - dealing 3 dmg to ${attackCommand.target}")
        }
    }

    override fun reportName(): String = "Swordsman $name"
}