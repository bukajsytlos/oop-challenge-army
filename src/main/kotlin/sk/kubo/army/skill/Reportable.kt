package sk.kubo.army.skill

import sk.kubo.army.Command

interface Reportable : Skill {
    fun report(reportCommand: Report)
}

class Report : Command("REPORTING")