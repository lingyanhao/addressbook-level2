package seedu.addressbook.commands;

/**
 * Sorts the list of persons
 */
public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_USAGE = COMMAND_WORD + "";
    public static final String MESSAGE_SUCCESS = "List sorted.";

    public SortCommand() {}

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
