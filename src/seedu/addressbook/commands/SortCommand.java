package seedu.addressbook.commands;

import seedu.addressbook.data.person.*;

import java.util.List;

/**
 * Sorts the address book and lists it.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the AddressBook by lexicographic order"
            + " and lists the sorted output.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getSortedPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }

}
