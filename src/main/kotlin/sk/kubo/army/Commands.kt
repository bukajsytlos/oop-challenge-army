package sk.kubo.army

abstract class Command(val name: String)

interface CommandExecutor {
    fun execute(command: Command)
}