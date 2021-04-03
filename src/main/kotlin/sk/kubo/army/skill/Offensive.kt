package sk.kubo.army.skill

import sk.kubo.army.Command

interface Offensive : Skill {
    fun attack(attackCommand: Attack)
}

sealed class Attack(name: String, val target: String) : Command(name) {
    class Normal(target: String) : Attack("NORMAL ATTACK", target)
    class Aggressive(target: String) : Attack("AGGRESSIVE ATTACK", target)
    class Sneaky(target: String) : Attack("SNEAKY ATTACK", target)
}


