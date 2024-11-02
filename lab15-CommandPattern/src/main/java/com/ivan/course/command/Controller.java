package com.ivan.course.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Controller {
    private Command command;

    public void execute() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }

    public void backup() {
        command.backup();
    }
}
