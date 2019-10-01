package org.mapstruct.example.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.example.dto.Issue;
import org.mapstruct.example.dto.IssueCard;
import org.mapstruct.example.dto.IssueRs;

import java.util.List;

@Mapper
public abstract class IssueCardMapper  {

    @InheritInverseConfiguration
    public abstract Issue toIssue(IssueCard issueCard);

    @Mapping(source = "actions", target = "actions")
    public abstract IssueRs toRs(Issue issue, List<String> actions);

}
