package sk.kubo.army.skill

import sk.kubo.army.Command

interface Defensive : Skill {
    fun defend(defenceCommand: Defence)
}

sealed class Defence(name: String) : Command(name) {
    class Normal : Defence("NORMAL DEFENCE")
    class Static : Defence("STATIC DEFENCE")
}
