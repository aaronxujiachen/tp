package seedu.nuscents.commands;


import seedu.nuscents.data.TaskList;

public class DeleteCommand extends Command {
    private int taskIndex;

    public DeleteCommand (int taskIndex) {
        this.taskIndex = taskIndex;
    }

    @Override
    public void execute(TaskList tasks) {
        tasks.deleteTask(taskIndex);
    }
}
