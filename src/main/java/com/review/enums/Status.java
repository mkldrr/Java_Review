package com.review.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status {

    IN_PROGRESS ("In progress"), OPEN ("Open"), UAT_TEST("UAT Testing"), COMPLETED ("Completed");


    private String value;


}
