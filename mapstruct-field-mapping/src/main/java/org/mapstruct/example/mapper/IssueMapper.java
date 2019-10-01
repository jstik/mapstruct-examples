package org.mapstruct.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.example.dto.Issue;
import org.mapstruct.example.dto.IssueCard;

@Mapper
public abstract class IssueMapper  {


    public  abstract IssueCard toCard(Issue issue);


    @Mapping(source = "action", target = "action")
    public  abstract IssueCard toCard(IssueCard issueCard, String action);
}
