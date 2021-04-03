package sk.kubo.army

import sk.kubo.army.skill.Attack
import sk.kubo.army.skill.Defence
import sk.kubo.army.skill.Flank
import sk.kubo.army.skill.Report
import sk.kubo.army.soldier.Archer
import sk.kubo.army.soldier.Berserk
import sk.kubo.army.soldier.Knight
import sk.kubo.army.soldier.Swordsman

fun main() {
    val army = Army()
    army.addSoldier(Swordsman("Jozo"))
    army.addSoldier(Swordsman("Fero"))
    army.addSoldier(Berserk("Stefan"))
    army.addSoldier(Archer("Michael"))
    army.addSoldier(Knight("Kazimir"))

    army.execute(Report())
    army.execute(Attack.Normal("Prva lajna"))
    army.execute(Attack.Aggressive("Druha lajna"))
    army.execute(Attack.Sneaky("Tretia lajna"))
    army.execute(Defence.Normal())
    army.execute(Defence.Static())
    army.execute(Flank())
}