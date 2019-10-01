package org.mapstruct.example.dto;

import java.util.List;

public class IssueRs {
    private Issue issue;

    private List<String> actions;

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
}
