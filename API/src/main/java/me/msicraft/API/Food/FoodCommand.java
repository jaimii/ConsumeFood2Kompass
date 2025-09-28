package me.msicraft.API.Food;

public class FoodCommand {

    public enum ExecuteType {
        CONSOLE, PLAYER, NONE
    }
    private final String command;
    private final ExecuteType executeType;

    public FoodCommand(String command, ExecuteType executeType) {
        this.command = command;
        this.executeType = executeType;
    }

    public String getCommand() {
        return command;
    }

    public ExecuteType getExecuteType() {
        return executeType;
    }

    public String toFormat() {
        if (executeType == ExecuteType.NONE) {
            return command;
        }
        return executeType.name() + ":" + command;
    }

}
