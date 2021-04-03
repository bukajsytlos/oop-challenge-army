package sk.kubo.army.skill

import sk.kubo.army.Command

interface Flanking : Skill {
    fun flank(flankCommand: Flank)
}

class Flank : Command("FLANK")


